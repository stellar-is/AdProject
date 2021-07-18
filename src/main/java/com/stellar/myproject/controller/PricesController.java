package com.stellar.myproject.controller;

import com.stellar.myproject.entity.dto.PricesDto;
import com.stellar.myproject.service.PricesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.stellar.myproject.configuration.Swagger2Config.ORDER;
import static com.stellar.myproject.configuration.Swagger2Config.PRICE;

@Api(tags = PRICE)
@RestController
@RequestMapping(value = "/api/v1/prices")
public class PricesController {

    @Autowired
    private PricesService pricesService;

    @PostMapping("/save")
    public PricesDto save(@RequestBody PricesDto pricesDto){
        return pricesService.save(pricesDto);
    }
}
