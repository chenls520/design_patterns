package com.design.patterns.builder.test2;


/**
 * 具体的生成器实现对象
 * @author chenliangsen
 * @date 2019/12/13 11:04
 */
public class ConcreteBuilder implements Builder{
    /**
     *生成器最终构建的产品对象
     */
    private Product resultProduct;

    /**
     * 获取生成器最终构建的产品对象
     * @return 生成器最终构建的产品对象
     */
    public Product getResultProduct() {
        return resultProduct;
    }

    @Override
    public void buildPart() {
        //构建某个部件的功能处理
    }
}
