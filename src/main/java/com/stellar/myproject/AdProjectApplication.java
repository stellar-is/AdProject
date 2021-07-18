package com.stellar.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.stellar.myproject.microservice")
@EnableDiscoveryClient
public class AdProjectApplication {

    public static void main(String[] args) { SpringApplication.run(AdProjectApplication.class, args);
    }

}
