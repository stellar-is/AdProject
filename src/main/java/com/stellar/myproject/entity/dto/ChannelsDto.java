package com.stellar.myproject.entity.dto;

import lombok.Data;

@Data
public class ChannelsDto {
    private Long id;
    private String name;
    private String logo;
    private boolean isActive;

}
