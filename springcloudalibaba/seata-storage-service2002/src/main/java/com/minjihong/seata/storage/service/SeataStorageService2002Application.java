package com.minjihong.seata.storage.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.minjihong.seata.storage.service.dao")
public class SeataStorageService2002Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataStorageService2002Application.class, args);
    }

}
