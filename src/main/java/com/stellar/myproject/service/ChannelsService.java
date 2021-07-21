package com.stellar.myproject.service;


import com.stellar.myproject.entity.dto.ChannelsDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ChannelsService {

    List<ChannelsDto> findAll();
    ChannelsDto findById(Long id);
    ChannelsDto update(ChannelsDto channelsDto, MultipartFile file);
    ChannelsDto save(ChannelsDto channelsDto, MultipartFile file);
    List<ChannelsDto>findActiveChannels();
    ChannelsDto disActivateChannel(Long id);
}
