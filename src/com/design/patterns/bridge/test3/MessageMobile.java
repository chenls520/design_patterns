package com.design.patterns.bridge.test3;

/**
 * 以手机消息的方式发送消息
 * @author chenliangsen
 * @date 2020/1/7 14:06
 */
public class MessageMobile implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短消息的方式，发送消息" + message + "给" + toUser);
    }
}
