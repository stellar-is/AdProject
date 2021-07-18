package com.stellar.myproject.entity.objects;

import com.stellar.myproject.entity.dto.ChannelsDto;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ChannelDays {

    private ChannelsDto channelsDto;
    private List<Date> days;
}
