package com.minjihong.seata.storage.service.service.impl;

import com.minjihong.seata.storage.service.dao.StorageDao;
import com.minjihong.seata.storage.service.domain.Storage;
import com.minjihong.seata.storage.service.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        Storage storage = storageDao.selectById(productId);
        storage.setUsed(storage.getUsed() + count);
        storage.setResidue(storage.getResidue() - count);
        storageDao.updateById(storage);
    }
}
