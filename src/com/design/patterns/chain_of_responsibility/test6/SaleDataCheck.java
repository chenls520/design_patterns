package com.design.patterns.chain_of_responsibility.test6;

/**
 * 进行权限检查的职责对象
 * @author chenliangsen
 * @date 2020/1/7 10:52
 */
public class SaleDataCheck extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //进行数据通用检查，稍麻烦点，每个数据都要检查
        if (user == null || user.trim().length()==0) {
            System.out.println("申请人不能为空");
            return false;
        }

        if (customer == null || customer.trim().length() == 0) {
            System.out.println("客户不能为空");
            return false;
        }

        if (saleModel == null) {
            System.out.println("销售商品的数据不能为空");
            return false;
        }
        if (saleModel.getGoods() == null || saleModel.getGoods().trim().length() == 0) {
            System.out.println("销售的商品不能为空");
            return false;
        }
        if (saleModel.getSaleNum()==0) {
            System.out.println("销售商品的数量不能为0");
            return false;
        }
        //如果通过了上面的检测，那就向下继续执行
        return this.successor.sale(user, customer, saleModel);
    }
}
