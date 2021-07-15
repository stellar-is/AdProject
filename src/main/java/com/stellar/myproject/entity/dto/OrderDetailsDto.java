package com.stellar.myproject.entity.dto;

import lombok.Data;

@Data
public class OrderDetailsDto {
    private Long id;
    private OrdersDto orders;
    private ChannelsDto channels;
    private double price;
}
