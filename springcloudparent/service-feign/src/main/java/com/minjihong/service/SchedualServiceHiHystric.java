package com.minjihong.service;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/10/10.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry,"+name;
    }
}
