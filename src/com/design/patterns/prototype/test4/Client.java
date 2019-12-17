package com.design.patterns.prototype.test4;


/**
 * @author chenliangsen
 * @date 2019/12/17 17:21
 */
public class Client {
    public static void main(String[] args) {
        PersonalOrder op = new PersonalOrder();
        op.setCustomerName("张三");
        op.setOrderProductNum(2925);
        op.setProductId("P001");
        op.setProduct(new Product("001", "产品1"));
        System.out.println(op);
        PersonalOrder op2 = (PersonalOrder) op.clone();
        System.out.println(op2);
        System.out.println(op == op2);
        System.out.println(op.equals(op2));

    }
}
