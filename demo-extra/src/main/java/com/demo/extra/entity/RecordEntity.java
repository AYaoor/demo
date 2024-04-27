package com.demo.extra.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("t_interface_record")
public class RecordEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private String interfaceName;

    private String type;

    private String msgIn;

    private String msgOut;

    private Date createTime;
}
