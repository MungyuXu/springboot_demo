package com.xmy.springboot_demo.manager.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmy.springboot_demo.dao.OrderDao;
import com.xmy.springboot_demo.domain.Order;
import com.xmy.springboot_demo.manager.OrderManager;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 15:04
 * @description:
 */
@Service
public class OrderManagerImpl extends ServiceImpl<OrderDao,Order> implements OrderManager {

    @Override
    public List<Order> getAllOrder() {
        return list();
    }


}
