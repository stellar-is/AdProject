package com.stellar.myproject.service.impl;
import com.stellar.myproject.entity.Channels;
import com.stellar.myproject.entity.dto.ChannelsDto;
import com.stellar.myproject.mappers.ChannelsMapper;
import com.stellar.myproject.microservice.FileServiceFeign;
import com.stellar.myproject.repository.ChannelsRepo;
import com.stellar.myproject.service.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelsServiceImpl implements ChannelsService {
    @Autowired
    ChannelsRepo channelsRepo;

    @Autowired
    FileServiceFeign fileServiceFeign;

    @Override
    public ChannelsDto saveChannel(ChannelsDto channelsDto) {
        Channels channels = ChannelsMapper.INSTANCE.channelsDtoToChannels(channelsDto);
        channels = channelsRepo.save(channels);
        return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
    }

    @Override
    public List<ChannelsDto> findAll() {
        List<Channels> channelsList = channelsRepo.findAll();
        List<ChannelsDto>channelsDtoList = ChannelsMapper.INSTANCE.channelsListToChannelsDtoList(channelsList);
        List<Channels> channelsList1List = ChannelsMapper.INSTANCE.channelsDtoListToChannelsList(channelsDtoList);
        System.out.println(channelsDtoList);
        return channelsDtoList;
    }
    @Override
    public ChannelsDto findById(Long id){
        Channels channels = channelsRepo.findById(id).orElse(null);
        if(channels == null){
            throw new RuntimeException("Not found");
        }
        return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
    }

    @Override
    public ChannelsDto update(ChannelsDto channelsDto) {
        Channels channels = channelsRepo.findById(channelsDto.getId()).orElse(null);
        if(channels == null){
            throw new RuntimeException("Not found");
        }
//        channelsEntity.setLogo(channelsDto.getLogo());
//        channelsEntity.setName(channelsDto.getName());
//        ChannelsEntity channelsEntity1 = channelRepo.save(channelsEntity);
channels = ChannelsMapper.INSTANCE.channelsDtoToChannels(channelsDto);
        channels = channelsRepo.save(channels);
        return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
    }

}
