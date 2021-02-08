package com.xmy.springboot_demo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xmy.springboot_demo.domain.UserDO;
import com.xmy.springboot_demo.dto.UserRoleDto;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author angtai
 * @since 2020-09-10
 */
public interface UserDao extends BaseMapper<UserDO> {

    /**
     * 方法一:通过注解多表查询
     * @return
     */
    @Select("SELECT u.id,u.name,u.`password` ,r.uid,r.rid,r.msg FROM USER u LEFT JOIN user_role r ON u.id = r.uid ")
    List<UserRoleDto> queryUserAndRole();


    /**
     * 方法二 通过xml中的sql
     * @return
     */
    List<UserRoleDto> queryUserAndRoleTwo();



}
