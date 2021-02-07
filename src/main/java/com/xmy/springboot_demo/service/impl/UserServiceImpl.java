package com.xmy.springboot_demo.service.impl;

import com.xmy.springboot_demo.domain.UserDO;
import com.xmy.springboot_demo.manager.UserManager;
import com.xmy.springboot_demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 15:02
 * @description:
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserManager userManager;

    @Override
    public List<UserDO> getAllUser() {
        return userManager.list();
    }

    @Override
    public boolean addUser(UserDO user) {

        return userManager.save(user);
    }

    @Override
    public boolean deleteUser(Integer id) {
        return userManager.removeById(id);
    }

    @Override
    public boolean updateUser( UserDO userDO) {
        return   userManager.updateById(userDO);
            }
}
