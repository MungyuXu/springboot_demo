package com.xmy.springboot_demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author: 徐梦雨
 * @date: 2021/2/7 13:35
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user_role")
public class UserRoleDO {
    private  static  final  long serialVersionUID=1L;

    @TableId(value = "id",type= IdType.AUTO)
    private  Integer id;

    private Integer uid;

    private Integer rid;

    private  String msg;
}
