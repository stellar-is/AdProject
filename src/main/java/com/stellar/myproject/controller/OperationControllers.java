package com.stellar.myproject.controller;

import com.stellar.myproject.entity.objects.FinalResponse;
import com.stellar.myproject.entity.objects.InputData;
import com.stellar.myproject.service.OperationService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.stellar.myproject.configuration.Swagger2Config.*;

@Api(tags = CLIENT)
@RestController
@RequestMapping(value = "/api/v1/operation")
public class OperationControllers {

    @Autowired
    private OperationService operationService;

    @PostMapping("/submitAnAdvertisement")
    public FinalResponse save(@RequestBody InputData inputData){
        return operationService.operation(inputData);
    }


}
