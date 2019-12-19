package com.design.patterns.proxy.test2;

/**
 * 具体的目标对象，是真正被代理的对象
 * @author chenliangsen
 * @date 2019/12/19 9:37
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        //执行具体的功能处理
    }
}
