package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.Orders;
import com.stellar.myproject.entity.dto.OrdersDto;
import com.stellar.myproject.mappers.OrdersMapper;
import com.stellar.myproject.repository.OrdersRepo;
import com.stellar.myproject.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    OrdersRepo ordersRepo;


    @Override
    public OrdersDto save(OrdersDto ordersDto) {
        Orders orders = OrdersMapper.INSTANCE.ordersDtoToOrders(ordersDto);
        orders = ordersRepo.save(orders);
        return OrdersMapper.INSTANCE.ordersToOrdersDto(orders);

    }

    @Override
    public OrdersDto findById(Long id) {
        return null;
    }

    @Override
    public OrdersDto update(OrdersDto orderDto) {
        return null;
    }

}
