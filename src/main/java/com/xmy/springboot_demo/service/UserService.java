package com.xmy.springboot_demo.service;

import com.xmy.springboot_demo.domain.UserDO;
import com.xmy.springboot_demo.dto.UserRoleDto;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 15:02
 * @description:
 */
public interface UserService {
    /**
     * 获取全部用户信息
     *
     * @return
     */
    List<UserDO> getAllUser();

    boolean addUser(UserDO user);

    boolean deleteUser(Integer id);

    boolean updateUser(UserDO userDO);


    /**
     * 查询用户和他有的权限
     * @return
     */
    List<UserRoleDto> queryUserAndRole();
}
