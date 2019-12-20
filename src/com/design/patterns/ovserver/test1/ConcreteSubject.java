package com.design.patterns.ovserver.test1;

/**
 * 具体的目标对象，负责把所有状态存入到相应的观察者对象
 * 并在自己状态发生改变时，通知各个观察者
 * @author chenliangsen
 * @date 2019/12/20 9:45
 */
public class ConcreteSubject extends Subject {

    /**
     * 示意，目标对象的状态
     */
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
        //状态发生了改变，通知各个观察者
        this.notifyObservers();
    }
}
