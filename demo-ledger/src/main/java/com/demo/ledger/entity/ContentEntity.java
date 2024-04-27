package com.demo.ledger.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author tianyao
 * @email tianyao@email.com
 * @date 2024-02-22 11:55:48
 */
@Data
@TableName("t_info_content")
public class ContentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private String payName;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private BigDecimal amount;
	/**
	 * 1收入，2支出
	 */
	private String payType;
	/**
	 * 
	 */
	private String remark;
	/**
	 * 0取消，1交易完成，2已退款
	 */
	private String payStatus;

}
