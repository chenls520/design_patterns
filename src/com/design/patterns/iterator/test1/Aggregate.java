package com.design.patterns.iterator.test1;

/**
 * 聚合对象的接口， 定义创建相应迭代器对象的接口
 * @author chenliangsen
 * @date 2019/12/24 14:12
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代器对象的接口
     * @return 相应迭代器对象的接口
     */
    public abstract Iterator createIterator();
}
