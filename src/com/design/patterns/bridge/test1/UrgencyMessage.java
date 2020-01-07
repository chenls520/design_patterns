package com.design.patterns.bridge.test1;

/**
 * 加急消息的抽象接口
 * @author chenliangsen
 * @date 2020/1/7 13:35
 */
public interface UrgencyMessage extends Message{
    /**
     * 监控某消息的处理过程
     * @param messageId 被监控的消息的编号
     * @return 包含监控到的数据对象，这里示意一下，所以用了Object
     */
    public Object watch(String messageId);
}
