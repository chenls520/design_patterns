package com.design.patterns.proxy.test5;

import com.design.patterns.proxy.test4.Order;
import com.design.patterns.proxy.test4.OrderApi;

/**
 * @author chenliangsen
 * @date 2019/12/19 11:15
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order("设计模式", 100, "张珊");
        //创建一个动态代理
        DynamicProxy dynamicProxy = new DynamicProxy();
        //把订单和动态代理管理起来
        OrderApi orderApi = dynamicProxy.getProxyInterface(order);
        orderApi.setOrderNum(123, "李四");
        System.out.println(order);
        orderApi.setOrderNum(263, "张珊");
        System.out.println(order);
    }
}
