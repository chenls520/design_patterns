package com.design.patterns.visitor.test1;

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

    /**
     * 个人客户提出服务请求的方法，示意一下
     */
    @Override
    public void serviceRequest() {
        //个人客户提出的具体服务请求
        System.out.println("客户" + this.getName() + "提出服务请求");
    }

    @Override
    public void predilectionAnalyze() {
        System.out.println("现在对个人客户" + this.getName() + "进行产品偏好分析");
    }

    @Override
    public void worthAnalyze() {
        System.out.println("现在对个人客户" + this.getName() + "进行价值分析");
    }
}
