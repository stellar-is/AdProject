package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.Orders;
import com.stellar.myproject.entity.dto.OrdersDto;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersMapper {
    OrdersMapper INSTANCE = Mappers.getMapper(OrdersMapper.class);
    OrdersDto ordersToOrdersDto(Orders orders);
    Orders ordersDtoToOrders(OrdersDto ordersDto);
    List<OrdersDto>ordersListToOrdersDtoList(List<Orders>ordersList);
    List<Orders>ordersDtoListToOrdersList(List<OrdersDto>ordersDtoList);
}
