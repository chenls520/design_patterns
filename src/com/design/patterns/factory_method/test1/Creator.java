package com.design.patterns.factory_method.test1;

/**
 * 创建器，声明工厂方法
 * @author chenliangsen
 * @date 2019/12/12 10:14
 */
public abstract class Creator {
    /**
     * 创建Product的工厂方法
     * @return Product对象
     */
    protected abstract Product factoryMethod();

    /**
     * 示意方法，实现某些功能的方法
     */
    public void someOperation() {
        //通常在这些方法实现中需要调用工厂方法来获取Product对象
        Product product = factoryMethod();
    }
}
