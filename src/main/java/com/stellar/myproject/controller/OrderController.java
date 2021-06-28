package com.stellar.myproject.controller;

import com.stellar.myproject.entity.OrderEntity;
import com.stellar.myproject.repository.OrderRepo;
import com.stellar.myproject.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.stellar.myproject.configuration.Swagger2Config.ORDER;

@Api(tags = ORDER)
@RestController
public class OrderController {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    OrderService orderService;


    @PostMapping("/saveOrder")
    public OrderEntity saveOrder(@RequestBody OrderEntity order){
        return orderService.saveOrder(order);
    }
    @GetMapping("/findByName")
    public OrderEntity findByName(@RequestParam String name){
        return  orderService.findByName(name);
    }

    @GetMapping("/addNeworder")
    public String orders(Map<String, Object> model){
        Iterable<OrderEntity> orders = orderRepo.findAll();
        model.put("order",orders);
                return "order";
    }
    @PostMapping("/add")
    public String addOrders(@RequestParam String text, @RequestParam String phoneNumber, @RequestParam String name, Map<String, Object> model) {
       OrderEntity newOrder = new OrderEntity(text, phoneNumber, name);
       orderRepo.save(newOrder);
        Iterable<OrderEntity> orders = orderRepo.findAll();
        model.put("order",orders);
        return "order";
    }
}
