package com.xmy.springboot_demo.service;

import com.xmy.springboot_demo.domain.UserRoleDO;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/7 13:44
 * @description:
 */
public interface UserRoleService {
    public List<UserRoleDO> getAll();
}
