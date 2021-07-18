package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.Channels;
import com.stellar.myproject.entity.Clients;
import com.stellar.myproject.entity.dto.ClientsDto;
import com.stellar.myproject.mappers.ChannelsMapper;
import com.stellar.myproject.mappers.ClientsMapper;
import com.stellar.myproject.repository.ClientsRepo;
import com.stellar.myproject.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientsServiceImpl implements ClientsService {

    @Autowired
    private ClientsRepo clientsRepo;

    @Override
    public List<Clients> findAll() {
        return clientsRepo.findAll();
    }

    @Override
    public ClientsDto save(ClientsDto clientsDto) {
        Clients clients = ClientsMapper.INSTANCE.clientsDtoToClients(clientsDto);
        clients = clientsRepo.save(clients);
        return ClientsMapper.INSTANCE.clientsToClientsDto(clients);
    }

    @Override
    public ClientsDto findById(Long id) {
        return null;
    }

    @Override
    public ClientsDto findByPhone(String phone) {
        Clients clients = clientsRepo.findByPhone(phone);
        return ClientsMapper.INSTANCE.clientsToClientsDto(clients);
    }

    @Override
    public ClientsDto update(ClientsDto clientsDto) {
        Clients clients = clientsRepo.findById(clientsDto.getId()).orElse(null);
        if(clients == null){
            throw new RuntimeException("Not found");
        }
        clients = ClientsMapper.INSTANCE.clientsDtoToClients(clientsDto);
        clients = clientsRepo.save(clients);
        return ClientsMapper.INSTANCE.clientsToClientsDto(clients);
    }

}
