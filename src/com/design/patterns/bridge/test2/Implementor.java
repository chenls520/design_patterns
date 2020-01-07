package com.design.patterns.bridge.test2;

/**
 * 定义实现部分的接口，可以与抽象部分接口的方法不一样
 * @author chenliangsen
 * @date 2020/1/7 13:49
 */
public interface Implementor {
    /**
     * 示例方法，实现抽象部分需要的某些具体的功能
     */
    public void operationImpl();
}
