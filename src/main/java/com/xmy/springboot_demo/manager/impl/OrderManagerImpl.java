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
        return this.list();
    }

    @Override
    public boolean saveBatch(Collection<Order> entityList) {
        return false;
    }

    @Override
    public boolean saveOrUpdateBatch(Collection<Order> entityList) {
        return false;
    }

    @Override
    public boolean update(Wrapper<Order> updateWrapper) {
        return false;
    }

    @Override
    public boolean updateBatchById(Collection<Order> entityList) {
        return false;
    }

    @Override
    public Order getOne(Wrapper<Order> queryWrapper) {
        return null;
    }

    @Override
    public <V> V getObj(Wrapper<Order> queryWrapper, Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public List<Order> list() {
        return null;
    }

    @Override
    public IPage<Order> page(IPage<Order> page) {
        return null;
    }

    @Override
    public List<Map<String, Object>> listMaps() {
        return null;
    }

    @Override
    public List<Object> listObjs() {
        return null;
    }

    @Override
    public <V> List<V> listObjs(Function<? super Object, V> mapper) {
        return null;
    }

    @Override
    public List<Object> listObjs(Wrapper<Order> queryWrapper) {
        return null;
    }

    @Override
    public IPage<Map<String, Object>> pageMaps(IPage<Order> page) {
        return null;
    }

    @Override
    public QueryChainWrapper<Order> query() {
        return null;
    }

    @Override
    public LambdaQueryChainWrapper<Order> lambdaQuery() {
        return null;
    }

    @Override
    public UpdateChainWrapper<Order> update() {
        return null;
    }

    @Override
    public LambdaUpdateChainWrapper<Order> lambdaUpdate() {
        return null;
    }
}
