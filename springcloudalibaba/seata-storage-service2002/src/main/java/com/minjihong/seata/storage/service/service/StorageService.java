package com.minjihong.seata.storage.service.service;

public interface StorageService {

    void decrease(Long productId,Integer count);
}
