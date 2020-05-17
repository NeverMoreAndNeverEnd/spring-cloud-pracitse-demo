package com.minjihong.seata.account.service.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_account")
public class Account {

    @TableId
    private Long id;

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "total")
    private BigDecimal total;

    @TableField(value = "used")
    private BigDecimal used;

    @TableField(value = "residue")
    private BigDecimal residue;
}
