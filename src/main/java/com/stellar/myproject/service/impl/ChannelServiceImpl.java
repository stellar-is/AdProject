package com.stellar.myproject.service.impl;
import com.stellar.myproject.entity.ChannelsEntity;
import com.stellar.myproject.repository.ChannelRepo;
import com.stellar.myproject.service.ChannelService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    ChannelRepo channelRepo;

    @Override
    public ChannelsEntity saveChannel(ChannelsEntity channel) {
        return channelRepo.save(channel);
    }

}
