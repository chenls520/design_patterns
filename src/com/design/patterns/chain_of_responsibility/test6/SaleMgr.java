package com.design.patterns.chain_of_responsibility.test6;

/**
 * 进行权限检查的职责对象
 * @author chenliangsen
 * @date 2020/1/7 10:52
 */
public class SaleMgr extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //进行真正的业务逻辑处理
        System.out.println(user + "保存了" + customer + "购买" + saleModel + "销售数据");
        return true;
    }
}
