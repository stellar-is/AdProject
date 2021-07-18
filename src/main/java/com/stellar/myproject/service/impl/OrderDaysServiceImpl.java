package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.OrdersDays;
import com.stellar.myproject.entity.dto.OrdersDaysDto;
import com.stellar.myproject.mappers.OrderDaysMapper;
import com.stellar.myproject.repository.OrderDaysRepo;
import com.stellar.myproject.service.OrderDaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDaysServiceImpl implements OrderDaysService {

    @Autowired
    private OrderDaysRepo orderDaysRepo;

    @Override
    public OrdersDaysDto save(OrdersDaysDto ordersDaysDto) {
        OrdersDays ordersDays = OrderDaysMapper.INSTANCE.orderDaysDtoToOrderDays(ordersDaysDto);
        ordersDays = orderDaysRepo.save(ordersDays);
        return OrderDaysMapper.INSTANCE.orderDaysToOrderDaysDto(ordersDays);
    }
}
