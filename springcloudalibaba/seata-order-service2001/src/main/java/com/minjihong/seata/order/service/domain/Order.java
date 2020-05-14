package com.minjihong.seata.order.service.domain;

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
@TableName(value = "t_order")
public class Order {

    @TableId
    private Long id;

    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "product_id")
    private Long productId;

    @TableField(value = "count")
    private Integer count;

    @TableField(value = "money")
    private BigDecimal money;

    @TableField(value = "status")
    private Integer status;//订单状态:0:创建中,1:已完结

}
