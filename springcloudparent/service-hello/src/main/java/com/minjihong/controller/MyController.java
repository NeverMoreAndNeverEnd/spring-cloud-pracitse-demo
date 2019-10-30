package com.minjihong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/10/29.
 */
@RestController
public class MyController {

    @RequestMapping(value = "/getBookByName")
    public String getNameById(@RequestParam("id") String id){
        String bookName = "";
        switch (id){
            case "1" :
                bookName = "Java";
                break;
            case "2" :
                bookName = "C++";
                break;
            default:
                bookName = "phython";
        }
        return bookName;
    }
}
