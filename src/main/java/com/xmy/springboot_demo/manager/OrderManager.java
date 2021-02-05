package com.xmy.springboot_demo.manager;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xmy.springboot_demo.domain.Order;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 15:04
 * @description:
 */
public interface OrderManager extends IService<Order> {

   List<Order> getAllOrder();
}
