package com.minjihong.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(@RequestParam(value = "name", defaultValue = "mjh") String name) {

        return "hi " + name + " I am from port:" + port;

    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"!";
    }
}
