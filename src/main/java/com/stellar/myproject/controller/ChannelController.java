package com.stellar.myproject.controller;

import com.stellar.myproject.entity.ChannelsEntity;
import com.stellar.myproject.service.ChannelService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.stellar.myproject.configuration.Swagger2Config.CHANNEL;

@Api(tags = CHANNEL)
@RestController
public class ChannelController {
    @Autowired
    ChannelService channelService;

    @PostMapping
    ChannelsEntity saveChannel(@RequestBody ChannelsEntity channel){
        return channelService.saveChannel(channel);
    }
}
