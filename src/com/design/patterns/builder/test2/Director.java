package com.design.patterns.builder.test2;

/**
 * 指导者，指导使用生成器的接口来构建产品的对象
 * @author chenliangsen
 * @date 2019/12/13 11:07
 */
public class Director {
    /**
     * 持有当前需要使用的生成器对象
     */
    private Builder builder;

    /**
     * 构造方法，传入生成器对象
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 示意方法，指导生成器构建最终的产品对象
     */
    public void construct() {
        //通过使用生成器接口来构建最终的产品对象
        builder.buildPart();
    }
}
