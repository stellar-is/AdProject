package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.Orders;
import com.stellar.myproject.entity.dto.OrdersDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper
public interface OrderDaysMapper {
    OrdersMapper INSTANCE = Mappers.getMapper(OrdersMapper.class);
    OrdersDto ordersToOrdersDto(Orders orders);
    Orders ordersDtoToOrders(OrdersDto ordersDto);
    List<OrdersDto>ordersLisToOrdersDtoList(List<Orders>ordersList);
    List<Orders>ordersDtoLisToOrdersList(List<OrdersDto>ordersDtoList);

}
