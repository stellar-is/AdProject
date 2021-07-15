package com.stellar.myproject.controller;

import com.stellar.myproject.entity.Channels;
import com.stellar.myproject.entity.dto.ChannelsDto;
import com.stellar.myproject.service.ChannelsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.stellar.myproject.configuration.Swagger2Config.CHANNEL;

@Api(tags = CHANNEL)
@RestController
@RequestMapping(value = "/api/v1/channels")
public class ChannelsController {
    @Autowired
    ChannelsService channelsService;

    @PostMapping
    ChannelsDto saveChannel(@RequestBody ChannelsDto channelsDto) {
        return channelsService.saveChannel(channelsDto);
    }

    @GetMapping("/findAll")
    public List<ChannelsDto> findAll(){
        return channelsService.findAll();
    }

}
