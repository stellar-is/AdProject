package com.stellar.myproject.controller;

import com.stellar.myproject.entity.dto.PricesDto;
import com.stellar.myproject.service.PricesService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.stellar.myproject.configuration.Swagger2Config.ADMIN;

@Api(tags = ADMIN)
@RestController
@RequestMapping(value = "/api/v1/prices")
public class PricesController {

    @Autowired
    private PricesService pricesService;

    @PostMapping("/savePrice")
    public PricesDto save(@RequestBody PricesDto pricesDto) {
        return pricesService.save(pricesDto);
    }

    @PutMapping("/updatePrice")
    public PricesDto update(@RequestBody PricesDto pricesDto){
        return pricesService.update(pricesDto);
    }

    @GetMapping("/findAllPrices")
    public List<PricesDto>findAll(){
        return pricesService.findAll();
    }

    @GetMapping("/findByPriceId")
    public PricesDto findById(Long id){
    return pricesService.findById(id);
    }
}