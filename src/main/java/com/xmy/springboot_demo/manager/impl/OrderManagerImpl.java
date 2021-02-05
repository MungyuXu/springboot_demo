package com.xmy.springboot_demo.manager.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.QueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.additional.update.impl.UpdateChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmy.springboot_demo.dao.OrderDao;
import com.xmy.springboot_demo.domain.Order;
import com.xmy.springboot_demo.manager.OrderManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 15:04
 * @description:
 */
@Service
public class OrderManagerImpl extends ServiceImpl<OrderDao,Order> implements OrderManager {

    @Autowired
    private OrderDao orderDao;


    @Override
    public List<Order> getAllOrder() {
        return (List<Order>) this.list().stream().limit(5);
    }


}
