package com.xmy.springboot_demo.controller;

import com.xmy.springboot_demo.domain.Order;
import com.xmy.springboot_demo.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: 徐梦雨
 * @date: 2021/2/5 14:53
 * @description:
 */

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    IOrderService orderService;

    @GetMapping("getAll")
    public List<Order> getAllPage(){
        return orderService.getAllOrder();
    }
}