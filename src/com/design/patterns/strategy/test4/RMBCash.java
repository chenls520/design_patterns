package com.design.patterns.strategy.test4;

/**
 * 人民币现金支付
 * @author chenliangsen
 * @date 2019/12/31 11:32
 */
public class RMBCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + " 人民币现金支付 " + ctx.getMoney());
    }
}
