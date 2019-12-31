package com.design.patterns.strategy.test4;

/**
 * @author chenliangsen
 * @date 2019/12/31 11:33
 */
public class Client {
    public static void main(String[] args) {
        PaymentStrategy strategyRMB = new RMBCash();
        PaymentStrategy strategyDollar = new DollarCash();

        PaymentContext ctx1 = new PaymentContext("张珊", 5000, strategyRMB);
        ctx1.payNow();

        PaymentContext ctx2 = new PaymentContext("李四", 8000, strategyDollar);
        ctx2.payNow();

        PaymentStrategy strategyCard = new Card();
        PaymentContext ctx3 = new PaymentContext2("小王", 9000, strategyCard, "0123457895214");
        ctx3.payNow();

    }
}
