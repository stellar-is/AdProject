package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.Orders;
import com.stellar.myproject.repository.OrderRepo;
import com.stellar.myproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;


    @Override
    public Orders saveOrder(Orders order) {

        return orderRepo.save(order);

    }

    @Override
    public Orders findByName(String name) {
        return orderRepo.findByName(name);
    }
}
