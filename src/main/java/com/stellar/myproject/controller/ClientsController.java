package com.stellar.myproject.controller;

import com.stellar.myproject.entity.dto.ClientsDto;
import com.stellar.myproject.service.ClientsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import static com.stellar.myproject.configuration.Swagger2Config.ADMIN;


@Api(tags = ADMIN)
@RestController
@RequestMapping(value = "/api/v1/clients")
public class ClientsController {

    @Autowired
    ClientsService clientsService;

    @PostMapping("/saveClient")
    public ClientsDto save(@RequestBody ClientsDto clientsDto) {
        return clientsService.save(clientsDto);
    }

    @PutMapping("/updateClient")
    public ClientsDto update(@RequestBody ClientsDto clientsDto){
        return clientsService.update(clientsDto);
    }

    @GetMapping("/findAllClients")
    public List<ClientsDto>findAll(){
        return clientsService.findAll();
    }

    @GetMapping("/findByClientId")
    public ClientsDto findById(Long id){
        return clientsService.findById(id);
    }
}
