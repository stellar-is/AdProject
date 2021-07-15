package com.stellar.myproject.service.impl;

import com.stellar.myproject.entity.dto.ChannelsDto;
import com.stellar.myproject.microservice.FileServiceFeign;
import com.stellar.myproject.microservice.objects.Response;
import com.stellar.myproject.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileServiceFeign fileServiceFeign;
    @Autowired
    private ChannelsServiceImpl channelService;

    @Override
    public ChannelsDto uploadLogo(Long id, MultipartFile file) {
        ChannelsDto channelsDto = channelService.findById(id);
        Response response = fileServiceFeign.upload(file);
        channelsDto.setLogo(response.getDownloadUri());
        channelsDto = channelService.update(channelsDto);

        return channelsDto;
    }
}
