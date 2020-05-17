package com.minjihong.seata.account.service.service.impl;

import com.minjihong.seata.account.service.dao.AccountDao;
import com.minjihong.seata.account.service.domain.Account;
import com.minjihong.seata.account.service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        Account account = accountDao.selectById(userId);
        account.setUsed(account.getUsed().add(money));
        account.setResidue(account.getResidue().subtract(money));
        accountDao.updateById(account);
    }
}
