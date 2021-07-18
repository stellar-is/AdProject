package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.Discounts;
import com.stellar.myproject.entity.dto.DiscountsDto;
import com.stellar.myproject.mappers.DiscountsMapper;
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
        return null;
    }

    @Override
    public DiscountsDto save(DiscountsDto discountDto) {
        Discounts discounts = DiscountsMapper.INSTANCE.discountsDtoToDiscounts(discountDto);
        discounts = discountsRepo.save(discounts);
        return DiscountsMapper.INSTANCE.discountsToDiscountsDto(discounts);
    }

    @Override
    public DiscountsDto findByChannelsAndMinDay(int days, Long id) {
        System.out.println(days);
        Discounts discounts = discountsRepo.findByChannelsAndMinDays(days, id);
        System.out.println("db " + discounts);
        return DiscountsMapper.INSTANCE.discountsToDiscountsDto(discounts);
    }
}
