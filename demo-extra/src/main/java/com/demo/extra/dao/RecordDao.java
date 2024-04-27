package com.demo.extra.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.extra.entity.RecordEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordDao extends BaseMapper<RecordEntity> {
}
