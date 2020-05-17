package com.minjihong.seata.storage.service.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_storage")
public class Storage {

    @TableId
    private Long id;

    @TableField(value = "product_id")
    private Long productId;

    @TableField(value = "total")
    private Integer total;

    @TableField(value = "used")
    private Integer used;

    @TableField(value = "residue")
    private Integer residue;

}
