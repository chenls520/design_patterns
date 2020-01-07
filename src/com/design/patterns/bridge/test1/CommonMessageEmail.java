package com.design.patterns.bridge.test1;

/**
 * @author chenliangsen
 * @date 2020/1/7 11:18
 */
public class CommonMessageEmail implements Message {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用E-mail的方式，发送消息" + message + "给" + toUser);
    }
}
