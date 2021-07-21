package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.OrdersDays;
import com.stellar.myproject.entity.dto.OrdersDaysDto;
import com.stellar.myproject.entity.dto.OrdersDetailsDto;
import com.stellar.myproject.mappers.OrderDaysMapper;
import com.stellar.myproject.mappers.OrderDetailsMapper;
import com.stellar.myproject.repository.OrderDaysRepo;
import com.stellar.myproject.service.OrderDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderDaysServiceImpl implements OrderDaysService {

    @Autowired
    private OrderDaysRepo orderDaysRepo;

    @Override
    public OrdersDaysDto save(OrdersDaysDto ordersDaysDto) {
        OrdersDays ordersDays = orderDaysRepo.save(OrderDaysMapper.INSTANCE.ordersDaysDtoToOrdersDays(ordersDaysDto));
        return OrderDaysMapper.INSTANCE.ordersDaysToOrdersDaysDto(ordersDays);
    }

    @Override
    public OrdersDaysDto saveDate(Date date, OrdersDetailsDto ordersDetailsDto) {
        OrdersDaysDto ordersDaysDto = new OrdersDaysDto();
        ordersDaysDto.setDay(date);
        ordersDaysDto.setOrdersDetails(ordersDetailsDto);
        OrdersDays ordersDays =orderDaysRepo.save(OrderDaysMapper.INSTANCE.ordersDaysDtoToOrdersDays(ordersDaysDto));
        return OrderDaysMapper.INSTANCE.ordersDaysToOrdersDaysDto(ordersDays);
    }
}
