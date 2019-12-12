package com.design.patterns.factory_method.test1;

/**
 * 具体的创建器实现对象
 * @author chenliangsen
 * @date 2019/12/12 10:17
 */
public class ConcreteCreator extends Creator{
    @Override
    protected Product factoryMethod() {
        //重定义工厂方法，返回一个具体的Product对象
        return new ConcreteProduct();
    }
}
