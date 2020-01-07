package com.design.patterns.visitor.test2;

/**
 * 被访问的元素的接口
 * @author chenliangsen
 * @date 2020/1/7 15:43
 */
public abstract class Element {
    /**
     * 接受访问者的访问
     * @param visitor 访问者对象
     */
    public abstract void accept(Visitor visitor);
}
