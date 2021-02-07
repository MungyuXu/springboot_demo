package com.xmy.springboot_demo.service.impl;

import com.xmy.springboot_demo.domain.UserRoleDO;
import com.xmy.springboot_demo.manager.UserRoleManager;
import com.xmy.springboot_demo.service.UserRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/7 13:44
 * @description:
 */
@Slf4j
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleManager userRoleManager;

    @Override
    public List<UserRoleDO> getAll(){
      return   userRoleManager.list();
    }
}
