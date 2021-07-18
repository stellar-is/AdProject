package com.stellar.myproject.controller;

import com.stellar.myproject.entity.dto.ChannelsDto;
import com.stellar.myproject.service.ChannelsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static com.stellar.myproject.configuration.Swagger2Config.CHANNEL;

@Api(tags = CHANNEL)
@RestController
@RequestMapping(value = "/api/v1/channels")
public class ChannelsController {
    @Autowired
    ChannelsService channelsService;

    @PostMapping("/saveChannelWithLogo")
    ChannelsDto save(@ModelAttribute ChannelsDto channelsDto, @RequestPart MultipartFile file) {
        return channelsService.save(channelsDto, file);
    }

    @GetMapping("/findAll")
    public List<ChannelsDto> findAll(){
        return channelsService.findAll();
    }

    @PutMapping("/updateChannel")
    public ChannelsDto updateChannel(@ModelAttribute ChannelsDto channelsDto, @RequestPart(required = false) MultipartFile file){
        return channelsService.update(channelsDto, file);
    }
    @GetMapping("/findActiveChannels")
    public List<ChannelsDto>findActiveChannels(){
        return channelsService.findActiveChannels();
    }
    @DeleteMapping("/disActivateChannel")
    public ChannelsDto disActivateChannel(Long id){
        return channelsService.disActivateChannel(id);
    }
}
