package com.xmy.springboot_demo.controller;

import com.xmy.springboot_demo.domain.UserRoleDO;
import com.xmy.springboot_demo.manager.UserRoleManager;
import com.xmy.springboot_demo.service.UserRoleService;
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

    @GetMapping("getAll")
    public List<UserRoleDO> getAll(){
        return  userRoleService.getAll();
    }
}
