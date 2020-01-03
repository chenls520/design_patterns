package com.design.patterns.flyweight.test2;

/**
 * 不需要共享的flyweight对象
 * 通常是将被共享的享元对象作为子节点组合出来的对象
 * @author chenliangsen
 * @date 2020/1/3 10:12
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    /**
     * 示例，描述对象的状态
     */
    private String allState;
    @Override
    public void operation(String extrinsicState) {
        //具体的功能
    }
}
