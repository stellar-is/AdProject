package com.stellar.myproject.controller;


import com.stellar.myproject.entity.dto.OrdersDaysDto;
import com.stellar.myproject.service.OrderDaysService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.stellar.myproject.configuration.Swagger2Config.ORDER;

@Api(tags = ORDER)
@RestController
@RequestMapping(value = "/api/v1/order-days")
public class OrderDaysControllers {

    @Autowired
    private OrderDaysService orderDaysService;

    @PostMapping("/save")
    public OrdersDaysDto save(@RequestBody OrdersDaysDto ordersDaysDto){
        return orderDaysService.save(ordersDaysDto);
    }
}
