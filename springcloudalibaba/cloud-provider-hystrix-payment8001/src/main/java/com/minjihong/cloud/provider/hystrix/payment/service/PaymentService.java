package com.minjihong.cloud.provider.hystrix.payment.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {

    /**
     * 正常访问,肯定ok
     *
     * @param id
     * @return
     */
    public String paymentInfo_ok(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_ok,id:" + id + "\t" + "哈哈";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_timeout_handler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_timeout(Integer id) {
        int time = 2;
        //int age = 10 / 0;
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_timeout,id:" + id + "\t" + "哈哈" + "耗时(s):" + time;
    }

    public String paymentInfo_timeout_handler(Integer id) {
        return "线程池:" + Thread.currentThread().getName() + "paymentInfo_timeout_handler,id:" + id + "\t" + "呵呵";
    }

    //==================服务 熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback", commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"),//失败率达到多少后跳闸
    })
    public String paymentCircuitBreaker(Integer id) {
        if (id < 0) {
            throw new RuntimeException("********id 不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "\t" + "调用成功,流水号:" + serialNumber;
    }

    public String paymentCircuitBreaker_fallback(Integer id) {
        return "id 不能为负数,请稍后再试,id:" + id;
    }


}
