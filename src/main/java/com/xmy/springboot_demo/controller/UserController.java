package com.xmy.springboot_demo.controller;

import com.xmy.springboot_demo.domain.UserDO;
import com.xmy.springboot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 14:53
 * @description:
 */

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("getAll")
    public List<UserDO> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("addUser")
    public  boolean addUser(@RequestBody UserDO userDO){
        return userService.addUser(userDO);
    }

    @PostMapping("deleteUser")
    public  boolean deleteUser( Integer id){
      return   userService.deleteUser(id);
    }


    @PostMapping("updateUser")
    public  boolean updateUser(@RequestBody UserDO userDO){
        return  userService.updateUser(userDO);
    }
}
