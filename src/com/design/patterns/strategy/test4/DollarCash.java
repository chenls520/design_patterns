package com.design.patterns.strategy.test4;

/**
 * 美元现金支付
 * @author chenliangsen
 * @date 2019/12/31 11:32
 */
public class DollarCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + " 美元现金支付 " + ctx.getMoney());
    }
}
