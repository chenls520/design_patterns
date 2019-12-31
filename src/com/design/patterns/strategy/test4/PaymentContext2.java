package com.design.patterns.strategy.test4;

/**
 * @author chenliangsen
 * @date 2019/12/31 11:36
 */
public class PaymentContext2 extends PaymentContext {

    private String accout = null;

    /**
     * 构造方法，传入被支付工资的人员，应支付的金额和具体的支付策略
     * @param userName 被支付工资的人员
     * @param money 应支付的金额
     * @param strategy 具体的支付策略
     * @param accout 支付到的银行账号
     */
    public PaymentContext2(String userName, double money,
                           PaymentStrategy strategy, String accout) {
        super(userName, money, strategy);
        this.accout = accout;
    }

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout;
    }
}
