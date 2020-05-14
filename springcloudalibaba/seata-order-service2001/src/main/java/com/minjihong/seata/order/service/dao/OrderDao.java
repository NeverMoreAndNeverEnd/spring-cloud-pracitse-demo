package com.minjihong.seata.order.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.minjihong.seata.order.service.domain.Order;
import org.springframework.stereotype.Component;

@Component
public interface OrderDao extends BaseMapper<Order> {
}
