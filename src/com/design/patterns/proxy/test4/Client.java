package com.design.patterns.proxy.test4;

/**
 * @author chenliangsen
 * @date 2019/12/19 11:06
 */
public class Client {
    public static void main(String[] args) {
        OrderApi order = new OrderProxy(new Order("设计模式", 100, "张珊"));
        order.setOrderNum(123, "李四");
        System.out.println(order);
        order.setOrderNum(234, "张珊");
        System.out.println(order);
    }
}
