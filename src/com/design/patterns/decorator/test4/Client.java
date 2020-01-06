package com.design.patterns.decorator.test4;

/**
 * @author chenliangsen
 * @date 2020/1/6 15:08
 */
public class Client {
    public static void main(String[] args) {
        GoodsSaleEbi ebi = new CheckDecorator(
                new LogDecorator(
                        new GoodsSaleEbo()
                )
        );

        SaleModel saleModel1 = new SaleModel();
        saleModel1.setGoods("Moto 手机");
        saleModel1.setSaleNum(2);
        ebi.sale("张珊", "张珊二", saleModel1);
        ebi.sale("李四", "张珊二", saleModel1);
    }
}
