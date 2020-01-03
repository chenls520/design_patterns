package com.design.patterns.flyweight.test2;

/**
 * 享元对象
 * @author chenliangsen
 * @date 2020/1/3 10:08
 */
public class ConcreteFlyweight implements Flyweight {
    /**
     * 示例，描述内部状态
     */
    private String intrinsicState;

    /**
     *构造方法，传入享元对象的内部状态的数据
     * @param intrinsicState 享元对象的内部状态的数据
     */
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理，可能会用到享元内部、外部的状态
    }
}
