package com.design.patterns.memento.test3;

/**
 * 负责保存模拟运行流程A的对象的备忘录对象
 * @author chenliangsen
 * @date 2020/1/2 11:03
 */
public class FlowAMementoCareTaker {
    /**
     * 记录被保存的备忘录对象
     */
    private FlowAMockMemento memento = null;

    /**
     *保存备忘录对象
     * @param memento 被保存的备忘录对象
     */
    public void saveMemento(FlowAMockMemento memento) {
        this.memento = memento;
    }

    /**
     * 获取被保存的备忘录对象
     * @return 被保存的备忘录对象
     */
    public FlowAMockMemento retirveMemento() {
        return this.memento;
    }
}
