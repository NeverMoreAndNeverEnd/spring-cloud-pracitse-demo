package com.minjihong.cloud.provider.payment.service.impl;

import com.minjihong.cloud.api.commons.entities.Payment;
import com.minjihong.cloud.provider.payment.dao.PaymentDao;
import com.minjihong.cloud.provider.payment.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.insert(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.selectById(id);
    }
}
