package com.design.patterns.visitor.test2;

/**
 * 具体元素的实现对象
 * @author chenliangsen
 * @date 2020/1/7 15:44
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitConcreteElementA(this);
    }

    /**
     * 示例方法，表示元素已有的功能实现
     */
    public void operationA() {
        //已有的功能实现
    }
}
