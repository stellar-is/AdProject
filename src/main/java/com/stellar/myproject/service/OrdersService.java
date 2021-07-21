package com.stellar.myproject.service;

import com.stellar.myproject.entity.dto.OrdersDto;
import java.util.List;


public interface OrdersService {

    OrdersDto save(OrdersDto orderDto);
    OrdersDto findById (Long id);
    OrdersDto update (OrdersDto orderDto);
    List<OrdersDto>findAll();
}
