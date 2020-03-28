package com.minjihong.cloud.provider.payment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.minjihong.cloud.provider.payment.dao")
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudProviderPayment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001Application.class, args);
    }

}
