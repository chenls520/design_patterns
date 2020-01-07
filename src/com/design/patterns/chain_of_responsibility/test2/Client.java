package com.design.patterns.chain_of_responsibility.test2;

/**
 * @author chenliangsen
 * @date 2020/1/7 10:03
 */
public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.setSuccessor(h2);
        h1.handleRequest();

    }
}
