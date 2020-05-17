package com.minjihong.seata.storage.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.minjihong.seata.storage.service.domain.Storage;
import org.springframework.stereotype.Component;

@Component
public interface StorageDao extends BaseMapper<Storage> {
}
