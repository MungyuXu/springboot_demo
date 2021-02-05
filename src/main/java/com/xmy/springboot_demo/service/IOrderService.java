package com.xmy.springboot_demo.service;

import com.xmy.springboot_demo.domain.Order;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 15:02
 * @description:
 */
public interface IOrderService {
    List<Order> getAllOrder();
}
