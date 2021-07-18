package com.stellar.myproject.entity.dto;

import lombok.Data;

@Data
public class OrdersDto {
    private Long id;
    private String text;
    private int amount;
    private boolean status;
    private ClientsDto clients;
    private double totalSum;

}
