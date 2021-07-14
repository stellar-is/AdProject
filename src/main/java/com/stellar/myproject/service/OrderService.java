package com.stellar.myproject.service;
import com.stellar.myproject.entity.Orders;


public interface OrderService {

    Orders saveOrder(Orders order);
    Orders findByName(String name);
}
