package com.stellar.myproject.entity.dto;

import com.stellar.myproject.entity.Channels;
import lombok.Data;

@Data
public class DiscountDto {
    private Long id;
    private int days;
    private double percent;
    private Channels channel;

}
