package com.design.patterns.bridge.test3;

/**
 * @author chenliangsen
 * @date 2020/1/7 14:00
 */
public class CommonMessage extends AbstractionMessage {
    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        //对于普通消息，什么都不干，直接调用父类的方法，把消息发送出去就可以了
        super.sendMessage(message, toUser);
    }
}
