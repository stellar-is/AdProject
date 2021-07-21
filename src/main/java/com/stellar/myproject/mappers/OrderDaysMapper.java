package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.OrdersDays;
import com.stellar.myproject.entity.dto.OrdersDaysDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper
public interface OrderDaysMapper {
    OrderDaysMapper INSTANCE = Mappers.getMapper(OrderDaysMapper.class);
    OrdersDaysDto ordersDaysToOrdersDaysDto(OrdersDays ordersDays);
    OrdersDays ordersDaysDtoToOrdersDays(OrdersDaysDto ordersDaysDto);
    List<OrdersDaysDto>orderDaysLisToOrderDaysDtoList(List<OrdersDays> ordersDaysList);
    List<OrdersDays>orderDaysDtoLisToOrderDaysList(List<OrdersDaysDto> ordersDaysDtoList);

}
