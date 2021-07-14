package com.stellar.myproject.controller;

import com.stellar.myproject.entity.Orders;
import com.stellar.myproject.repository.OrderRepo;
import com.stellar.myproject.service.OrderService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

import static com.stellar.myproject.configuration.Swagger2Config.ORDER;

@Api(tags = ORDER)
@RestController
@RequestMapping(value = "/api/v1/ord")
public class OrderController {
    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    OrderService orderService;


    @PostMapping("/saveOrder")
    public Orders saveOrder(@RequestBody Orders order) {
        return orderService.saveOrder(order);
    }

    @GetMapping("/findByName")
    public Orders findByName(@RequestParam String name) {
        return orderService.findByName(name);
    }

    @GetMapping("/addNeworder")
    public String orders(Map<String, Object> model) {
        Iterable<Orders> orders = orderRepo.findAll();
        model.put("order", orders);
        return "order";
    }

    @PostMapping("/add")
    public String addOrders(@RequestParam String text, @RequestParam String phoneNumber, @RequestParam String name, Map<String, Object> model) {
        Orders newOrder = new Orders(text, phoneNumber, name);
        orderRepo.save(newOrder);
        Iterable<Orders> orders = orderRepo.findAll();
        model.put("order", orders);
        return "order";
    }
}
