package com.stellar.myproject.entity.objects;

import lombok.Data;
import java.util.List;

@Data
public class InputData {

    private String text;
    private String name;
    private String eMail;
    private String phone;
    private int symbolAmount;

    private List<ChannelDays> channelDays;

}
