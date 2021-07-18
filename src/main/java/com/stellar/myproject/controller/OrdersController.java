package com.stellar.myproject.controller;

import com.stellar.myproject.entity.dto.OrdersDto;
import com.stellar.myproject.service.OrdersService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static com.stellar.myproject.configuration.Swagger2Config.ORDER;

@Api(tags = ORDER)
@RestController
@RequestMapping(value = "/api/v1/orders")
public class OrdersController {

    @Autowired
    OrdersService ordersService;


    @PostMapping("/saveOrder")
    public OrdersDto saveOrder(@RequestBody OrdersDto ordersDto) {

        return ordersService.save(ordersDto);
    }

}
