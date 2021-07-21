package com.stellar.myproject.service;

import com.stellar.myproject.entity.Clients;
import com.stellar.myproject.entity.dto.ClientsDto;

import java.util.List;
public interface ClientsService {

    List<ClientsDto> findAll();
    ClientsDto save(ClientsDto clientsDto);
    ClientsDto findById (Long id);
    ClientsDto findByPhone(String phone);
    ClientsDto update (ClientsDto clientsDto);


}
