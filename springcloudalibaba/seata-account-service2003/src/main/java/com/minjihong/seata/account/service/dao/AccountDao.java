package com.minjihong.seata.account.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.minjihong.seata.account.service.domain.Account;
import org.springframework.stereotype.Component;

@Component
public interface AccountDao extends BaseMapper<Account> {
}
