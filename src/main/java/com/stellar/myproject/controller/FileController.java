package com.stellar.myproject.controller;

import com.stellar.myproject.service.FileService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import static com.stellar.myproject.configuration.Swagger2Config.CHANNEL;


@Api(tags = CHANNEL)
@RestController
@RequestMapping(value = "/api/v1/file")
public class FileController {
    @Autowired
    private FileService fileService;
//    @PostMapping
//    public ChannelsDto uploadLogo(@RequestParam Long channelId, @RequestPart MultipartFile file){
//        return fileService.uploadLogo(channelId, file);
//    }
}
