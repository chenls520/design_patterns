package com.design.patterns.mediator.test1;

/**
 * 具体同事类A
 * @author chenliangsen
 * @date 2019/12/18 10:02
 */
public class ConcreteColleagueA extends Colleague {
    /**
     * 构造方法，传入中介者对象
     *
     * @param mediator 中介者对象
     */
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /**
     * 示意方法，执行某些业务功能
     */
    public void someOperation() {
        //在需要跟其他同事通信的时候，通知中介者对象
        getMediator().changed(this);
    }
}
