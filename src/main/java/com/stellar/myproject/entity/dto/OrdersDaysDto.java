package com.stellar.myproject.entity.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrdersDaysDto {
    private Long id;
    private Date day;
    private OrdersDetailsDto ordersDetails;
}


