package com.design.patterns.strategy.test3;

/**
 * @author chenliangsen
 * @date 2019/12/31 11:18
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy = new LargeCustomerStrategy();
        Price price = new Price(strategy);
        double quote = price.quote(1000);
        System.out.println("向客户报价: " + quote);
    }
}
