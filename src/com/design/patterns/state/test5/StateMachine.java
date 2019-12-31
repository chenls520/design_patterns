package com.design.patterns.state.test5;

/**
 * 公共状态处理机，相当于状态模式的Context
 * 包含所有流程使用状态模式时的公共功能
 * @author chenliangsen
 * @date 2019/12/31 15:22
 */
public class StateMachine {
    /**
     * 持有一个状态对象
     */
    private State state = null;
    /**
     * 包含流程处理需要的业务数据对象，不知道具体类型，为了简单，不适用泛型
     * 用Object，反正只是传递到具体的状态对象中
     */
    private Object businessVO = null;

    public void doWork() {
        //转调相应的状态对象真正完成功能处理
        this.state.doWork(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Object getBusinessVO() {
        return businessVO;
    }

    public void setBusinessVO(Object businessVO) {
        this.businessVO = businessVO;
    }
}
