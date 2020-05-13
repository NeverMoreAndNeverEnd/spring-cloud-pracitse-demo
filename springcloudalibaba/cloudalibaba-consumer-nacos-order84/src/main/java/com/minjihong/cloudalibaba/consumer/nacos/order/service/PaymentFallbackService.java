package com.minjihong.cloudalibaba.consumer.nacos.order.service;

import com.minjihong.cloud.api.commons.entities.CommonResult;
import com.minjihong.cloud.api.commons.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,---PaymentFallbackService", new Payment(id, "error"));
    }
}
