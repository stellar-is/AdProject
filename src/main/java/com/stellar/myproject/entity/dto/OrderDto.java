package com.stellar.myproject.entity.dto;

import com.stellar.myproject.entity.Channels;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class OrderDto {
    private Long id;
    private String text;
    private List<Channels> channel;
    private Date date;
    private int amount;
    private String phoneNumber;
    private String eMail;
    private String name;
    private boolean isPaмid;
}
