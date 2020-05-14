package com.minjihong.seata.order.service.service.impl;

import com.minjihong.seata.order.service.dao.OrderDao;
import com.minjihong.seata.order.service.domain.Order;
import com.minjihong.seata.order.service.service.AccountService;
import com.minjihong.seata.order.service.service.OrderService;
import com.minjihong.seata.order.service.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private AccountService accountService;

    @Resource
    private StorageService storageService;


    @Override
    public void create(Order order) {
        log.info("-------------->开始新建订单");
        orderDao.insert(order);
        log.info("-------------->订单微服务开始调用库存,做扣减count");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("-------------->订单微服务开始调用库存,做扣减 end");
        log.info("-------------->订单微服务开始调用账户,做扣减money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("-------------->订单微服务开始调用账户,做扣减 end");
        log.info("-------------->开始修改订单状态");
        this.update(order.getUserId(),0);
        log.info("-------------->开始修改订单状态end");
        log.info("-------------->下订单结束!");
    }

    @Override
    public void update(Long userId, Integer status) {
        Order order = orderDao.selectById(userId);
        order.setStatus(status);
        orderDao.updateById(order);

    }
}
