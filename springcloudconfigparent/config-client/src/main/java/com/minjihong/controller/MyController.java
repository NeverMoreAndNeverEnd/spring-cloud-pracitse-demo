package com.minjihong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/10/23.
 */
@RestController
public class MyController {

    @Value("${foo}")
    private String foo;


    @GetMapping(value = "/hi")
    @ResponseBody
    public String hi(){
        System.out.println(foo);
        return foo;

    }

}
