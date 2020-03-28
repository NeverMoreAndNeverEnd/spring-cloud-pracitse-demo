package com.minjihong.cloud.consumer.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudconsumerorderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudconsumerorderApplication.class, args);
    }

}
