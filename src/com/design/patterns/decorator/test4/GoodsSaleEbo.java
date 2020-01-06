package com.design.patterns.decorator.test4;

/**
 * @author chenliangsen
 * @date 2020/1/6 15:02
 */
public class GoodsSaleEbo implements GoodsSaleEbi {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println(user + "保存了" + customer + "购买" + saleModel + "的销售数据");
        return true;
    }
}
