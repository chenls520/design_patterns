package com.design.patterns.chain_of_responsibility.test6;

/**
 * 进行权限检查的职责对象
 * @author chenliangsen
 * @date 2020/1/7 10:52
 */
public class SaleLoginCheck extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //进行数据的逻辑检测，比如检测id的唯一性，主键对应的关系等
        return this.successor.sale(user, customer, saleModel);
    }
}
