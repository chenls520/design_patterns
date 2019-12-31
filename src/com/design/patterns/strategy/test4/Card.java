package com.design.patterns.strategy.test4;

/**
 * @author chenliangsen
 * @date 2019/12/31 11:44
 */
public class Card implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        //这个新的算法自己知道要使用扩展的支付上下文，所以强转一下
        PaymentContext2 ctx2 = (PaymentContext2) ctx;
        System.out.println("现在给" + ctx2.getUserName() + "的" + ctx2.getAccout()
        + " 账号支付了 " + ctx2.getMoney());
        //连接银行，进行转账，就不去管了
    }
}
