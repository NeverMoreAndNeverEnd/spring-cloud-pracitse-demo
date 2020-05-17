package com.minjihong.seata.account.service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.minjihong.seata.account.service.dao")
public class SeataAccountService2003Application {

    public static void main(String[] args) {
        SpringApplication.run(SeataAccountService2003Application.class, args);
    }

}
