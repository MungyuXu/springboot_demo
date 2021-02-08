package com.xmy.springboot_demo.dto;

import lombok.Data;
import lombok.experimental.Accessors;


/**
 * @author: 徐梦雨
 * @date: 2021/2/7 17:03
 * @description:
 */
@Data
@Accessors(chain = true)
public class UserRoleDto {
    private static final long serialVersionUID = 1L;

//    user表id
    private  Integer id;
    private String name;
    private String password;
//    userrole表uid
    private  Integer uid;
    private  String msg;
    private Integer rid;

}
