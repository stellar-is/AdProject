package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.OrdersDetails;
import com.stellar.myproject.entity.dto.OrdersDetailsDto;
import com.stellar.myproject.entity.dto.OrdersDto;
import com.stellar.myproject.mappers.OrderDetailsMapper;
import com.stellar.myproject.mappers.OrdersMapper;
import com.stellar.myproject.repository.OrderDetailsRepo;
import com.stellar.myproject.service.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsRepo orderDetailsRepo;

    @Override
    public OrdersDetailsDto save(OrdersDetailsDto ordersDetailsDto) {
        OrdersDetails ordersDetails = OrderDetailsMapper.INSTANCE.orderDetailsDtoToOrderDetails(ordersDetailsDto);
        System.out.println(ordersDetails);
        ordersDetails = orderDetailsRepo.save(ordersDetails);

        return OrderDetailsMapper.INSTANCE.orderDetailsToOrderDetailsDto(ordersDetails);
    }

    @Override
    public List<OrdersDetailsDto> findAllByOrders(OrdersDto orderDto) {
        List<OrdersDetails> ordersDetails = orderDetailsRepo.findAllByOrders(OrdersMapper.INSTANCE.ordersDtoToOrders(orderDto));
        return OrderDetailsMapper.INSTANCE.orderDetailsListToOrderDetailsDtoList(ordersDetails);
    }
}
