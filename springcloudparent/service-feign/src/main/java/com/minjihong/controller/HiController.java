package com.minjihong.controller;

import com.minjihong.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/10/10.
 */
@RestController
public class HiController {


    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }


}
