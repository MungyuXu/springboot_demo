package com.xmy.springboot_demo.manager.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmy.springboot_demo.dao.UserRoleDao;
import com.xmy.springboot_demo.domain.UserDO;
import com.xmy.springboot_demo.domain.UserRoleDO;
import com.xmy.springboot_demo.manager.UserRoleManager;
import org.springframework.stereotype.Service;

/**
 * @author: 徐梦雨
 * @date: 2021/2/7 13:42
 * @description:
 */
@Service
public class UserRoleManagerImpl extends ServiceImpl<UserRoleDao, UserRoleDO> implements UserRoleManager {
}
