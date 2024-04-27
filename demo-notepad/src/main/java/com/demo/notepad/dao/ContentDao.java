package com.demo.notepad.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.notepad.entity.ContentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author tianyao
 * @email tianyao@email.com
 * @date 2024-02-22 11:55:48
 */
@Mapper
public interface ContentDao extends BaseMapper<ContentEntity> {
	
}
