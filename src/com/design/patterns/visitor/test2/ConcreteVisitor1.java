package com.design.patterns.visitor.test2;

/**
 * 具体的访问者实现
 * @author chenliangsen
 * @date 2020/1/7 15:47
 */
public class ConcreteVisitor1 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA elementA) {
        //把要访问ConcreteElementA时，需要执行的功能实现在这里，
        // 可能需要访问元素已有的功能，比如
        elementA.operationA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB elementB) {
        //把要访问ConcreteElementB时，需要执行的功能实现在这里，
        // 可能需要访问元素已有的功能，比如
        elementB.operationB();
    }
}
