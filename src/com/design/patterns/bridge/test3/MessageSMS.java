package com.design.patterns.bridge.test3;

/**
 * 以站内短消息的方式发送消息
 * @author chenliangsen
 * @date 2020/1/7 13:58
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用站内短消息的方式，发送消息" + message + "给" + toUser);
    }
}
