package com.stellar.myproject.service;

import com.stellar.myproject.entity.dto.OrdersDetailsDto;
import com.stellar.myproject.entity.dto.OrdersDto;
import  java.util.List;

public interface OrderDetailsService {

    OrdersDetailsDto save(OrdersDetailsDto ordersDetailsDto);

    List<OrdersDetailsDto> findAllByOrders(OrdersDto orderDto);
}
