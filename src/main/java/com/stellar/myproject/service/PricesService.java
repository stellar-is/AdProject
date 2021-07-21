package com.stellar.myproject.service;

import com.stellar.myproject.entity.dto.PricesDto;
import java.util.List;

public interface PricesService {

    PricesDto save(PricesDto pricesDto);
    PricesDto findByChannelsAndDate(Long channelId);
    PricesDto update(PricesDto pricesDto);
    List<PricesDto>findAll();
    PricesDto findById(Long id);

}
