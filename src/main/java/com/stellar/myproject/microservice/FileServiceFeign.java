package com.stellar.myproject.microservice;

import com.stellar.myproject.microservice.objects.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(value = "${micro.file-service.name}",url = "${micro.file-service.url}")
public interface FileServiceFeign {

    @PostMapping(value = "/api/v1/file/upload", consumes = "multipart/form-data")
    Response upload(@RequestPart MultipartFile file);
}
