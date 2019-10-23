package com.minjihong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/10/9.
 */
@RestController
public class DemoController {

    @Value("${server.port}")
    private String port;


    @RequestMapping("/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "mjh") String name) {

        return "hi " + name + " I am from port:" + port;

    }
}
