package com.demo.extra.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.extra.entity.RecordEntity;

import java.util.Map;

public interface RecordService extends IService<RecordEntity> {
    PageUtils queryPage(Map<String, Object> params);
}
