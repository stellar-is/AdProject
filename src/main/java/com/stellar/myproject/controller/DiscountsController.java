package com.stellar.myproject.controller;

import com.stellar.myproject.entity.dto.DiscountsDto;
import com.stellar.myproject.service.DiscountsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.stellar.myproject.configuration.Swagger2Config.CHANNEL;

@Api(tags = CHANNEL)
@RestController
@RequestMapping(value = "/api/v1/discounts")
public class DiscountsController {
    @Autowired
    private DiscountsService discountsService;

    @PostMapping("/save")
    public DiscountsDto save(@RequestBody DiscountsDto discountDto){
        return discountsService.save(discountDto);
    }
}
