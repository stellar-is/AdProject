package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.OrdersDetails;
import com.stellar.myproject.entity.dto.OrdersDetailsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface OrderDetailsMapper {
    OrderDetailsMapper INSTANCE = Mappers.getMapper(OrderDetailsMapper.class);
    OrdersDetailsDto orderDetailsToOrderDetailsDto(OrdersDetails ordersDetails);
    OrdersDetails orderDetailsDtoToOrderDetails(OrdersDetailsDto ordersDetailsDto);
    List<OrdersDetailsDto>orderDetailsListToOrderDetailsDtoList(List<OrdersDetails> ordersDetailsList);
    List<OrdersDetails>orderDetailsDtoListToOrderDetailsList(List<OrdersDetailsDto> ordersDetailsDtoList);
}
