package com.stellar.myproject.service;
import com.stellar.myproject.entity.OrderEntity;


public interface OrderService {

    OrderEntity saveOrder(OrderEntity order);
    OrderEntity findByName(String name);
}
