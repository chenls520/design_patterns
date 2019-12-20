package com.design.patterns.ovserver.test1;

/**
 * 观察者接口，定义一个更新的接口给那些在目标发生改变的时候被通知的对象
 * @author chenliangsen
 * @date 2019/12/20 9:36
 */
public interface Observer {
    /**
     * 更新的接口
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    public void update(Subject subject);
}
