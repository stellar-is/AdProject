package com.stellar.myproject.service;

import com.stellar.myproject.entity.dto.PricesDto;

public interface PricesService {
    PricesDto save(PricesDto pricesDto);
    PricesDto findByChannelsAndDate(Long channelId);
}
