package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.Discounts;
import com.stellar.myproject.entity.Prices;
import com.stellar.myproject.entity.dto.DiscountsDto;
import com.stellar.myproject.mappers.DiscountsMapper;
import com.stellar.myproject.mappers.PricesMapper;
import com.stellar.myproject.repository.DiscountsRepo;
import com.stellar.myproject.service.DiscountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountsServiceImpl implements DiscountsService {

    @Autowired
    private DiscountsRepo discountsRepo;

    @Override
    public List<DiscountsDto> findAll() {
        List<Discounts>discountsList = discountsRepo.findAll();
        List<DiscountsDto>discountsDtoList = DiscountsMapper.INSTANCE.discountsListToDiscountsDtoList(discountsList);
        return discountsDtoList;
    }

    @Override
    public DiscountsDto save(DiscountsDto discountDto) {
        Discounts discounts = DiscountsMapper.INSTANCE.discountsDtoToDiscounts(discountDto);
        discounts = discountsRepo.save(discounts);
        return DiscountsMapper.INSTANCE.discountsToDiscountsDto(discounts);
    }

    @Override
    public DiscountsDto findByChannelsAndMinDay(int days, Long id) {
        Discounts discounts = discountsRepo.findByChannelsAndMinDays(days, id);
        return DiscountsMapper.INSTANCE.discountsToDiscountsDto(discounts);
    }

    @Override
    public DiscountsDto update(DiscountsDto discountsDto) {
        Discounts discounts = discountsRepo.findById(discountsDto.getId()).orElse(null);
        if (discounts == null) {
            throw new RuntimeException("Not found");
        }
        discounts = DiscountsMapper.INSTANCE.discountsDtoToDiscounts(discountsDto);
        discountsRepo.save(discounts);
        return DiscountsMapper.INSTANCE.discountsToDiscountsDto(discounts);

    }

    @Override
    public DiscountsDto findById(Long id) {
        Discounts discounts = discountsRepo.findById(id).orElse(null);
        if (discounts == null){
            throw  new RuntimeException("Not found");
        }
        return DiscountsMapper.INSTANCE.discountsToDiscountsDto(discounts);
    }
}
