package com.stellar.myproject.service;

import com.stellar.myproject.entity.dto.OrdersDaysDto;
import com.stellar.myproject.entity.dto.OrdersDetailsDto;

import java.util.Date;

public interface OrderDaysService {

    OrdersDaysDto save(OrdersDaysDto ordersDaysDto);
    OrdersDaysDto saveDate(Date date, OrdersDetailsDto ordersDetailsDto);
}
