package com.design.patterns.template_method.test2;

/**
 * 定义模板方法，原语操作等的抽象类
 * @author chenliangsen
 * @date 2019/12/26 10:32
 */
public abstract class AbstarctClass {
    /**
     * 原语操作1， 所谓原语操作就是抽象的操作，必须要由子类提供实现
     */
    public abstract void doPrimitiveOperation1();

    /**
     * 原语操作2， 所谓原语操作就是抽象的操作，必须要由子类提供实现
     */
    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod() {
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }

}
