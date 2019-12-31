package com.design.patterns.strategy.test3;

/**
 * 具体算法实现，为新客户或者是普通客户计算应报的价格
 * @author chenliangsen
 * @date 2019/12/31 11:14
 */
public class OldlCustomerStrategy implements Strategy {
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice * ( 1 - 0.05);
    }
}
