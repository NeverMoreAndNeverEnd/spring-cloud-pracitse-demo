package com.minjihong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/10/29.
 */
@FeignClient(name = "provider")
@Component
public interface FeignService {

    @RequestMapping(value = "/getBookByName",method = RequestMethod.GET)
    String getBookByName(@RequestParam("id") String id);
}
