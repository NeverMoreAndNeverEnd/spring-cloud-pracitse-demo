package com.minjihong.seata.order.service;

import com.minjihong.seata.order.service.dao.OrderDao;
import com.minjihong.seata.order.service.domain.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class SeataOrderService2001ApplicationTests {

    @Autowired
    private OrderDao orderDao;

    @Test
    void contextLoads() {
    }

    @Test
    public void test1() {
        Order order = new Order();
        order.setUserId(1L);
        order.setCount(1);
        order.setProductId(2L);
        order.setMoney(new BigDecimal(100));
        order.setStatus(0);
        int insert = orderDao.insert(order);
        System.out.println(insert);

    }

    @Test
    public void test2() {
        Order order = orderDao.selectById(1260860852563660802L);
        order.setStatus(1);
        int i = orderDao.updateById(order);
        System.out.println(i);
    }


}
