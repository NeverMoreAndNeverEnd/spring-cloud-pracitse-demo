package com.minjihong.seata.order.service.service;

import com.minjihong.seata.order.service.domain.Order;

public interface OrderService {

    // 新建订单
    void create(Order order);

    // 修改订单状态,0->1
    void update(Long userId,Integer status);
}
