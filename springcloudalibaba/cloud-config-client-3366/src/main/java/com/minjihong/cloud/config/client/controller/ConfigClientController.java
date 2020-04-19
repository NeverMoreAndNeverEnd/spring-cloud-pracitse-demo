package com.minjihong.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {


    @Value("${foo}")
    private String foo;

    @GetMapping(value = "/hi")
    @ResponseBody
    public String hi(){
        System.out.println(foo);
        return foo;

    }

}
