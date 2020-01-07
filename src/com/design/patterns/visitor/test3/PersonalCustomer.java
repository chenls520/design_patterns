package com.design.patterns.visitor.test3;


/**
 * 个人客户
 * @author chenliangsen
 * @date 2020/1/7 15:20
 */
public class PersonalCustomer extends Customer {
    /**
     * 联系电话
     */
    private String telephone;
    /**
     * 年龄
     */
    private int age;
    /**
     * 企业注册地址
     */
    private String registerAddress;

    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的方法
        visitor.visitPersonalCustomer(this);
    }
}
