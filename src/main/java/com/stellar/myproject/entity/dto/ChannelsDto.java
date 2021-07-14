package com.stellar.myproject.entity.dto;

import com.stellar.myproject.entity.Orders;
import lombok.Data;

import java.util.List;

@Data
public class ChannelsDto {
    private Long id;
    private String name;
    private String logo;
    private boolean isActive;
    private double pricePerSymbol;
    private double pricePerBanner;
    private List<Orders> order;
}
