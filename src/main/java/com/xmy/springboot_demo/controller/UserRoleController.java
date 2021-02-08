package com.xmy.springboot_demo.controller;

import com.xmy.springboot_demo.dao.UserDao;
import com.xmy.springboot_demo.domain.UserRoleDO;
import com.xmy.springboot_demo.dto.UserRoleDto;
import com.xmy.springboot_demo.manager.UserRoleManager;
import com.xmy.springboot_demo.service.UserRoleService;
import com.xmy.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/7 14:17
 * @description:
 */
@RestController
@RequestMapping("userRole")
public class UserRoleController {

    @Autowired
    UserRoleService userRoleService;

    @Autowired
    UserDao userDao;

    @Autowired
    private UserService userService;

    @GetMapping("getAll")
    public List<UserRoleDO> getAll(){
        return  userRoleService.getAll();
    }

    @GetMapping("getUserRole")
    public  List<UserRoleDto> getUserRole(){
        return  userRoleService.getUserRole();
    }

    /**
     * 方法一
     * @return
     */
    @GetMapping("queryUserAndRole1")
    public  List<UserRoleDto> queryUserAndRole(){
        return  userService.queryUserAndRole();
    }

    /**
     * 方法二
     * @return
     */
    @GetMapping("queryUserAndRole2")
    public  List<UserRoleDto> queryUserAndRole2(){
        return  userDao.queryUserAndRoleTwo();
    }
}
