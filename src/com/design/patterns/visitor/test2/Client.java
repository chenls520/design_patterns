package com.design.patterns.visitor.test2;

/**
 * @author chenliangsen
 * @date 2020/1/7 15:52
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        Element eleA = new ConcreteElementA();
        Element eleB = new ConcreteElementB();
        os.addElement(eleA);
        os.addElement(eleB);

        Visitor visitor = new ConcreteVisitor1();
        os.handleRequest(visitor);
    }
}
