package com.design.patterns.prototype.test1;

/**
 * @author chenliangsen
 * @date 2019/12/17 14:44
 */
public class OrderClient {
    public static void main(String[] args) {
        PersonalOrder op = new PersonalOrder();
        op.setCustomerName("张三");
        op.setOrderProductNum(2925);
        op.setProductId("P001");
        OrderBusiness ob = new OrderBusiness();
        ob.saveOrder(op);
    }
}
