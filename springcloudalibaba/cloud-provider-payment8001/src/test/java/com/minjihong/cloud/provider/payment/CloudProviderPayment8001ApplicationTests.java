package com.minjihong.cloud.provider.payment;

import com.minjihong.cloud.provider.payment.dao.PaymentDao;
import com.minjihong.cloud.provider.payment.entities.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CloudProviderPayment8001ApplicationTests {


    @Autowired
    private PaymentDao paymentDao;

    @Test
    public void testPaymentDao() {
        Payment payment = new Payment();
        payment.setSerial("ffffaaaa");
        int i = paymentDao.insert(payment);
        System.out.println(i);
    }
}
