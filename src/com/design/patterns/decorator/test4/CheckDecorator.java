package com.design.patterns.decorator.test4;

/**
 * 实现权限控制
 * @author chenliangsen
 * @date 2020/1/6 15:04
 */
public class CheckDecorator extends Decorator {
    /**
     * 通过构造方法传入被装饰的对象
     *
     * @param ebi 被装饰的对象
     */
    public CheckDecorator(GoodsSaleEbi ebi) {
        super(ebi);
    }

    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //简单点，只让张三实现这个功能
        if (!"张珊".equals(user)) {
            System.out.println("对不起" + user + " 你没有保存销售单的权限");
            return false;
        } else {
            return this.ebi.sale(user, customer, saleModel);
        }
    }
}
