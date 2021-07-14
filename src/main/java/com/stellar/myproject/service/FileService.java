package com.stellar.myproject.service;

import com.stellar.myproject.entity.dto.ChannelsDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    ChannelsDto uploadLogo(Long id, MultipartFile file);
}
