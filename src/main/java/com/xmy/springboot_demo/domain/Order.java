package com.xmy.springboot_demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * @author: 徐梦雨
 * @date: 2021/2/5 14:56
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class Order extends Model<Order> {
    private static  final  long serialVersionUID=1L;

    @TableId(value = "orderId",type = IdType.AUTO)
    private  Integer orderId;

    @TableField("productId")
    private Integer productId;

    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }
}
