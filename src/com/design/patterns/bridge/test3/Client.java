package com.design.patterns.bridge.test3;

/**
 * @author chenliangsen
 * @date 2020/1/7 14:07
 */
public class Client {
    public static void main(String[] args) {
        MessageImplementor impl = new MessageSMS();
        AbstractionMessage m = new CommonMessage(impl);

        m.sendMessage("请喝一杯茶", "小李");
        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");

        impl = new MessageMobile();
        m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");
        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶", "小李");
    }
}
