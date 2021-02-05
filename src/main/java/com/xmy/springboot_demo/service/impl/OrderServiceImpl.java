package com.xmy.springboot_demo.service.impl;

import com.xmy.springboot_demo.domain.Order;
import com.xmy.springboot_demo.manager.OrderManager;
import com.xmy.springboot_demo.service.IOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 15:02
 * @description:
 */
@Slf4j
@Service
public class  OrderServiceImpl implements IOrderService {
    @Autowired
    OrderManager orderManager;

    @Override
    public List<Order> getAllOrder() {
        return orderManager.getAllOrder();
    }
}
