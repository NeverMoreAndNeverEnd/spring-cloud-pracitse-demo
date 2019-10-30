package com.minjihong.controller;

import com.minjihong.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/10/29.
 */
@RestController
public class MyController {

    @Autowired
    private FeignService feignService;

    @RequestMapping(value = "getBookName")
    public String getBookName(@RequestParam("id") String id){
        return feignService.getBookByName(id);
    }

}
