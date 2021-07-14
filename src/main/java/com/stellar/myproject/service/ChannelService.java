package com.stellar.myproject.service;

import com.stellar.myproject.entity.Channels;
import com.stellar.myproject.entity.dto.ChannelsDto;

import java.util.List;

public interface ChannelService{
    Channels saveChannel(Channels channel);
    List<ChannelsDto> findAll();

    ChannelsDto findById(Long id);

    ChannelsDto update(ChannelsDto channelsDto);
}
