package com.stellar.myproject.service.impl;
import com.stellar.myproject.entity.Channels;
import com.stellar.myproject.entity.dto.ChannelsDto;
import com.stellar.myproject.mappers.ChannelsMapper;
import com.stellar.myproject.repository.ChannelRepo;
import com.stellar.myproject.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    ChannelRepo channelRepo;

    @Override
    public Channels saveChannel(Channels channel) {
        return channelRepo.save(channel);
    }

    @Override
    public List<ChannelsDto> findAll() {
        List<Channels> channelsList = channelRepo.findAll();
        List<ChannelsDto>channelsDtoList = ChannelsMapper.INSTANCE.channelsListToChannelsDtoList(channelsList);
        List<Channels> channelsList1List = ChannelsMapper.INSTANCE.channelsDtoListToChannelsList(channelsDtoList);
        System.out.println(channelsDtoList);
        return channelsDtoList;
    }
    @Override
    public ChannelsDto findById(Long id){
        Channels channels = channelRepo.findById(id).orElse(null);
        if(channels == null){
            throw new RuntimeException("Not found");
        }
        return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
    }

    @Override
    public ChannelsDto update(ChannelsDto channelsDto) {
        Channels channels = channelRepo.findById(channelsDto.getId()).orElse(null);
        if(channels == null){
            throw new RuntimeException("Not found");
        }
//        channelsEntity.setLogo(channelsDto.getLogo());
//        channelsEntity.setName(channelsDto.getName());
//        ChannelsEntity channelsEntity1 = channelRepo.save(channelsEntity);
channels = ChannelsMapper.INSTANCE.channelsDtoToChannels(channelsDto);
        channels = channelRepo.save(channels);
        return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
    }

}
