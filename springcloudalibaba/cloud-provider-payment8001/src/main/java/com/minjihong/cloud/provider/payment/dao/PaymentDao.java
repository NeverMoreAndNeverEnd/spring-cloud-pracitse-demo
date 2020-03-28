package com.minjihong.cloud.provider.payment.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.minjihong.cloud.api.commons.entities.Payment;
import org.springframework.stereotype.Component;

@Component
public interface PaymentDao extends BaseMapper<Payment> {



}
