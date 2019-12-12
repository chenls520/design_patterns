package com.design.patterns.abstractfactory.test2;

/**
 * @author chenliangsen
 * @date 2019/12/12 14:36
 */
public class Client {


    public static void main(String[] args) {
        //创建抽象工厂对象
        AbstractFactory af = new ConcreteFactory1();
        //通过抽象工厂对象获取一系列对象，如产品A和产品B
        AbstractProductA productA = af.createProductA();
        AbstractProductB productB = af.createProductB();
    }
}
