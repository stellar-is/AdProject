package com.stellar.myproject.entity.dto;

import lombok.Data;

@Data
public class OrdersDaysDto {
    private Long id;
    private int day;
    private OrdersDetailsDto orderDetails;
}


