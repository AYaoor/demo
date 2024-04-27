package com.demo.ledger.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo.common.utils.PageUtils;
import com.demo.ledger.entity.ContentEntity;

import java.util.Map;

/**
 * 
 *
 * @author tianyao
 * @email tianyao@email.com
 * @date 2024-02-22 11:55:48
 */
public interface ContentService extends IService<ContentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

