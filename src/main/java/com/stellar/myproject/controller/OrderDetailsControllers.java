package com.stellar.myproject.controller;


import com.stellar.myproject.entity.dto.OrdersDetailsDto;
import com.stellar.myproject.service.OrderDetailsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.stellar.myproject.configuration.Swagger2Config.ADMIN;


@Api(tags = ADMIN)
@RestController
@RequestMapping(value = "/api/v1/order-details")
public class OrderDetailsControllers {

    @Autowired
    private OrderDetailsService orderDetailsService;

//    @PostMapping("/saveOrderDetails")
//    public OrdersDetailsDto save(@ModelAttribute OrdersDetailsDto ordersDetailsDto){
//        return orderDetailsService.save(ordersDetailsDto);
//    }

}
