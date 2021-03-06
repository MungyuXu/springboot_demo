package com.xmy.springboot_demo.manager;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmy.springboot_demo.domain.UserDO;
import com.xmy.springboot_demo.dto.UserRoleDto;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author angtai
 * @since 2020-09-10
 */
public interface UserManager extends IService<UserDO> {

    List<UserRoleDto> queryUserAndRole();

}
