package com.stellar.myproject.service;
import com.stellar.myproject.entity.Orders;
import com.stellar.myproject.entity.dto.OrdersDto;


public interface OrdersService {

    OrdersDto saveOrder(OrdersDto orderDto);

}
