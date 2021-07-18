package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.Prices;
import com.stellar.myproject.entity.dto.PricesDto;
import com.stellar.myproject.mappers.PricesMapper;
import com.stellar.myproject.repository.PricesRepo;
import com.stellar.myproject.service.PricesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;

@Service
public class PricesServiceImpl implements PricesService {

    @Autowired
    private PricesRepo pricesRepo;

    @Override
    public PricesDto save(PricesDto pricesDto) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Prices prices = PricesMapper.INSTANCE.pricesDtoToPrices(pricesDto);
        prices = pricesRepo.save(prices);
        return PricesMapper.INSTANCE.pricesToPricesDto(prices);
    }

    @Override
    public PricesDto findByChannelsAndDate(Long channelId) {
        Prices prices = pricesRepo.findByChannelsAndDate(channelId);
        System.out.println("price " + prices);
        return PricesMapper.INSTANCE.pricesToPricesDto(prices);
    }
}
