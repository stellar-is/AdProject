package com.stellar.myproject.entity.dto;

import lombok.Data;

@Data
public class OrdersDetailsDto {
    private Long id;
    private OrdersDto orders;
    private ChannelsDto channels;
    private double price;
}
