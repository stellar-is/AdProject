package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.Orders;
import com.stellar.myproject.entity.dto.OrdersDto;
import com.stellar.myproject.mappers.OrdersMapper;
import com.stellar.myproject.repository.OrdersRepo;
import com.stellar.myproject.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        Orders orders = ordersRepo.findById(id).orElse(null);
                if(orders == null){
                    throw new RuntimeException("Not found");
                }
        return OrdersMapper.INSTANCE.ordersToOrdersDto(orders);
    }

    @Override
    public OrdersDto update(OrdersDto orderDto) {

        Orders orders = ordersRepo.findById(orderDto.getId()).orElse(null);
        if(orders==null){
            throw new RuntimeException("Not found");
        }
        orders = OrdersMapper.INSTANCE.ordersDtoToOrders(orderDto);
        ordersRepo.save(orders);
        return OrdersMapper.INSTANCE.ordersToOrdersDto(orders);
    }

    @Override
    public List<OrdersDto> findAll() {
        List<Orders>ordersList = ordersRepo.findAll();
        List<OrdersDto>ordersDtoList = OrdersMapper.INSTANCE.ordersListToOrdersDtoList(ordersList);
        return ordersDtoList;
    }

}
