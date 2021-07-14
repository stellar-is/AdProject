package com.stellar.myproject.controller;

import com.stellar.myproject.entity.Channels;
import com.stellar.myproject.entity.dto.ChannelsDto;
import com.stellar.myproject.service.ChannelService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.stellar.myproject.configuration.Swagger2Config.CHANNEL;

@Api(tags = CHANNEL)
@RestController
@RequestMapping(value = "/api/v1/channels")
public class ChannelController {
    @Autowired
    ChannelService channelService;

    @PostMapping
    Channels saveChannel(@RequestBody Channels channel) {
        return channelService.saveChannel(channel);
    }

    @GetMapping("/findAll")
    public List<ChannelsDto> findAll(){
        return channelService.findAll();
    }

}
