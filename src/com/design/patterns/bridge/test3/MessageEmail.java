package com.design.patterns.bridge.test3;

/**
 * 以E-mail的方式发送消息
 * @author chenliangsen
 * @date 2020/1/7 13:59
 */
public class MessageEmail implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用E-mail的方式，发送消息" + message + "给" + toUser);
    }
}
