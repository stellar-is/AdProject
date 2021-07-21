package com.stellar.myproject.controller;


import com.stellar.myproject.entity.dto.OrdersDaysDto;
import com.stellar.myproject.entity.dto.OrdersDetailsDto;
import com.stellar.myproject.service.OrderDaysService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static com.stellar.myproject.configuration.Swagger2Config.ADMIN;

@Api(tags = ADMIN)
@RestController
@RequestMapping(value = "/api/v1/order-days")
public class OrderDaysControllers {

    @Autowired
    private OrderDaysService orderDaysService;

    @PostMapping
    public OrdersDaysDto saveDate(@RequestParam Date date, @RequestBody OrdersDetailsDto ordersDetailsDto){

        return orderDaysService.saveDate(date,ordersDetailsDto);
    }
    @PostMapping("/saveOrderDays")
    public OrdersDaysDto save(@RequestBody OrdersDaysDto ordersDaysDto){
        return orderDaysService.save(ordersDaysDto);
    }
}
