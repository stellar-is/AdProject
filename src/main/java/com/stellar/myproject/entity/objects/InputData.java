package com.stellar.myproject.entity.objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import java.util.List;

@Data
public class InputData {

    private String text;
    private String name;
    private String eMail;
    private String phone;
    @JsonIgnore
    private int symbolAmount;

    private List<ChannelDays> channelDays;

}
