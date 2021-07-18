package com.stellar.myproject.service.impl;
import com.stellar.myproject.entity.Channels;
import com.stellar.myproject.entity.dto.ChannelsDto;
import com.stellar.myproject.mappers.ChannelsMapper;
import com.stellar.myproject.microservice.FileServiceFeign;
import com.stellar.myproject.microservice.objects.Response;
import com.stellar.myproject.repository.ChannelsRepo;
import com.stellar.myproject.service.ChannelsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ChannelsServiceImpl implements ChannelsService {
    @Autowired
    ChannelsRepo channelsRepo;

    @Autowired
    ChannelsService channelsService;

    @Autowired
    FileServiceFeign fileServiceFeign;

    @Override
    public ChannelsDto save(ChannelsDto channelsDto, MultipartFile file) {
        Response response = fileServiceFeign.upload(file);
        channelsDto.setLogo(response.getDownloadUri());
        Channels channels = ChannelsMapper.INSTANCE.channelsDtoToChannels(channelsDto);
        channels = channelsRepo.save(channels);
        return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
    }

    @Override
    public List<ChannelsDto> findActiveChannels() {
        List<Channels> channelsList = channelsRepo.findByIsActiveTrue();
        List<ChannelsDto>channelsDtoList = ChannelsMapper.INSTANCE.channelsListToChannelsDtoList(channelsList);
        return channelsDtoList;
    }

    @Override
    public ChannelsDto disActivateChannel(Long id) {
        Channels channels = channelsRepo.findById(id).orElse(null);
        if(channels == null){
            throw new RuntimeException("Not found");
        }
        channels.setActive(false);
        channelsRepo.save(channels);
        return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
    }

    @Override
    public List<ChannelsDto> findAll() {
        List<Channels> channelsList = channelsRepo.findAll();
        List<ChannelsDto>channelsDtoList = ChannelsMapper.INSTANCE.channelsListToChannelsDtoList(channelsList);
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
    public ChannelsDto update(ChannelsDto channelsDto, MultipartFile file) {
        if (file==null){
            Channels channels = channelsRepo.findById(channelsDto.getId()).orElse(null);
            if(channels == null){
                throw new RuntimeException("Not found");
            }
            channelsDto.setLogo(channels.getLogo());
            if(channelsDto.getName()==null){

            if(channels == null){
                throw new RuntimeException("Not found");
            }
                channelsDto.setName(channels.getName());
                channels = ChannelsMapper.INSTANCE.channelsDtoToChannels(channelsDto);
                channels = channelsRepo.save(channels);
                 return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
            }
            channels = ChannelsMapper.INSTANCE.channelsDtoToChannels(channelsDto);
            channels = channelsRepo.save(channels);
            return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
        }

        Response response = fileServiceFeign.upload(file);
        channelsDto.setLogo(response.getDownloadUri());
        Channels channels = channelsRepo.findById(channelsDto.getId()).orElse(null);
        if(channels == null){
            throw new RuntimeException("Not found");
        }
        channelsDto.setName(channels.getName());
        channels = ChannelsMapper.INSTANCE.channelsDtoToChannels(channelsDto);
        channels = channelsRepo.save(channels);
        return ChannelsMapper.INSTANCE.channelsToChannelsDto(channels);
    }

}
