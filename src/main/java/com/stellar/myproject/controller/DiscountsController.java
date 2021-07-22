package com.stellar.myproject.controller;

import com.stellar.myproject.entity.dto.DiscountsDto;
import com.stellar.myproject.service.DiscountsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import static com.stellar.myproject.configuration.Swagger2Config.DISCOUNT;

@Api(tags = DISCOUNT)
@RestController
@RequestMapping(value = "/api/v1/discounts")
public class DiscountsController {

    @Autowired
    private DiscountsService discountsService;

    @PostMapping("/saveDiscount")
    public DiscountsDto save(@RequestBody DiscountsDto discountDto){
        return discountsService.save(discountDto);
    }

    @PutMapping("/updateDiscount")
    public DiscountsDto update(@RequestBody DiscountsDto discountsDto){
        return discountsService.update(discountsDto);
    }

    @GetMapping("/findAllDiscounts")
    public List<DiscountsDto>findAll(){
        return discountsService.findAll();
    }

    @GetMapping("/findByDiscountId")
    public DiscountsDto findById(Long id){
        return discountsService.findById(id);
    }
}
