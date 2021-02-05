package com.xmy.springboot_demo.manager.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmy.springboot_demo.dao.UserDao;
import com.xmy.springboot_demo.domain.UserDO;
import com.xmy.springboot_demo.manager.UserManager;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author angtai
 * @since 2020-09-10
 */
@Service
public class UserManagerImpl extends ServiceImpl<UserDao, UserDO> implements UserManager {

}
