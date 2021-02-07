package com.xmy.springboot_demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xmy.springboot_demo.domain.UserDO;
import com.xmy.springboot_demo.domain.UserRoleDO;
import com.xmy.springboot_demo.dto.UserRoleDto;
import com.xmy.springboot_demo.manager.UserManager;
import com.xmy.springboot_demo.manager.UserRoleManager;
import com.xmy.springboot_demo.service.UserRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    UserManager userManager;

    @Override
    public List<UserRoleDO> getAll(){
      return   userRoleManager.list();
    }

    @Override
    public List<UserRoleDto> getUserRole() {
        QueryWrapper<UserRoleDto> queryWrapper =new QueryWrapper<>();
        QueryWrapper<UserDO> userQueryWrapper=new QueryWrapper<>();
//        定义联表查询列表、user列表、userrole列表
        List<UserRoleDto> userRoleDtoList=new ArrayList<>();
        List<UserDO> userDOList=userManager.list();
        List<UserRoleDO> userRoleDOList=userRoleManager.list();

//        从userrole表遍历，将user与userrole的数据就行组装
        for(UserRoleDO userRoleDO:userRoleDOList){
//            取出user列表中id与userrole的uid相同的user类
            UserDO user=userDOList.get(userRoleDO.getUid());
//            实例化一个临时类存放userrole和user组装的数据
            UserRoleDto t_userRoleDto=new UserRoleDto();
            t_userRoleDto.setId(userRoleDO.getId())
                    .setMsg(userRoleDO.getMsg())
                    .setName(user.getName())
                    .setPassword(user.getPassword())
                    .setUid(user.getId())
                    .setRid(userRoleDO.getRid());
//            将数据放入arraylist内
            userRoleDtoList.add(t_userRoleDto);
        }
//        返回user与userrole组装的userRoleDto列表
        return userRoleDtoList;
    }
}
