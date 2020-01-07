package com.design.patterns.bridge.test3;

/**
 * @author chenliangsen
 * @date 2020/1/7 14:04
 */
public class SpecialUrgencyMessage extends AbstractionMessage {
    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl 实现部分的对象
     */
    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void hurry(String messageId) {
        //执行催促的业务，发出催促的信息
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "特急：" + message;
        super.sendMessage(message, toUser);
        //还需要增加一条待催促的信息
    }
}
