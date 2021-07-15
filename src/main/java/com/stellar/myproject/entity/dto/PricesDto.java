package com.stellar.myproject.entity.dto;

import lombok.Data;
import java.util.Date;

@Data
public class PricesDto {
    private Long id;
    private double price;
    private Date startDate;
    private Date endDate;
    private ChannelsDto channels;
}
