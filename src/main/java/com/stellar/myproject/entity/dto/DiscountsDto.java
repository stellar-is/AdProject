package com.stellar.myproject.entity.dto;

import lombok.Data;
import java.util.Date;

@Data
public class DiscountsDto {
    private Long id;
    private int discount;
    private Date startDate;
    private Date endDate;
    private int minDays;
    private ChannelsDto channels;

}
