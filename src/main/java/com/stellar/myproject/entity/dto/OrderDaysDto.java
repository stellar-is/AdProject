package com.stellar.myproject.entity.dto;

import lombok.Data;

@Data
public class OrderDaysDto {
    private Long id;
    private int day;
    private OrderDetailsDto orderDetails;
}


