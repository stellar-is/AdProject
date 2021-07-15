package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.Clients;
import com.stellar.myproject.entity.dto.ClientsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper
public interface ClientsMapper {
    ClientsMapper INSTANCE = Mappers.getMapper(ClientsMapper.class);
    ClientsDto clientsToClientsDto(Clients clients);
    Clients clientsDtoToClients(ClientsDto clientsDto);
    List<ClientsDto>clientsListToClientsDtoList(List<Clients>clientsList);
    List<Clients>clientsDtoListToClientsList(List<ClientsDto>clientsDtoList);

}
