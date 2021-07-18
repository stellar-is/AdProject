package com.stellar.myproject.service;

import com.stellar.myproject.entity.dto.DiscountsDto;
import java.util.*;

public interface DiscountsService {
    List<DiscountsDto> findAll();

    DiscountsDto save(DiscountsDto discountDto);

    DiscountsDto findByChannelsAndMinDay(int days, Long id);
}
