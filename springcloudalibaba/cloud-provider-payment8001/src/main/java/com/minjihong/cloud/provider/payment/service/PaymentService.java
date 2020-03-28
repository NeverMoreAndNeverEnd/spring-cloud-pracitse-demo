package com.minjihong.cloud.provider.payment.service;


import com.minjihong.cloud.api.commons.entities.Payment;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);

}
