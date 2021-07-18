package com.stellar.myproject.controller;

import com.stellar.myproject.entity.dto.ChannelsDto;
import com.stellar.myproject.entity.dto.ClientsDto;
import com.stellar.myproject.service.ClientsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import static com.stellar.myproject.configuration.Swagger2Config.CLIENT;

@Api(tags = CLIENT)
@RestController
@RequestMapping(value = "/api/v1/clients")
public class ClientsController {

    @Autowired
    ClientsService clientsService;

    @PostMapping("/saveClient")
    ClientsDto save(@RequestBody ClientsDto clientsDto) {
        return clientsService.save(clientsDto);
    }
}
