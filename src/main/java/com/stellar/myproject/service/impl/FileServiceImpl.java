package com.stellar.myproject.service.impl;

import com.stellar.myproject.microservice.FileServiceFeign;
import com.stellar.myproject.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileServiceFeign fileServiceFeign;
    @Autowired
    private ChannelsServiceImpl channelService;

}
