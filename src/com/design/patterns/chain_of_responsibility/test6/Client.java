package com.design.patterns.chain_of_responsibility.test6;

/**
 * @author chenliangsen
 * @date 2020/1/7 11:01
 */
public class Client {
    public static void main(String[] args) {
        GoodsSaleEbo eb = new GoodsSaleEbo();
        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("张学友怀旧经典");
        saleModel.setSaleNum(10);

        eb.sale("小李", "张三", saleModel);
        eb.sale("小张", "李四", saleModel);
    }
}
