package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.OrderDetails;
import com.stellar.myproject.entity.dto.OrderDetailsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper
public interface OrderDetailsMapper {
    OrderDetailsMapper INSTANCE = Mappers.getMapper(OrderDetailsMapper.class);
    OrderDetailsDto orderDetailsToOrderDetailsDto(OrderDetails orderDetails);
    OrderDetails orderDetailsDtoToOrderDetails(OrderDetailsDto orderDetailsDto);
    List<OrderDetailsDto>orderDetailsListToOrderDetailsDtoList(List<OrderDetails>orderDetailsList);
    List<OrderDetails>orderDetailsDtoListToOrderDetailsList(List<OrderDetailsDto>orderDetailsDtoList);
}
