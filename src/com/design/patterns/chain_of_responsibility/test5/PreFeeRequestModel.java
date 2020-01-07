package com.design.patterns.chain_of_responsibility.test5;

/**
 * 封装和聚餐费用申请业务相关的请求数据
 * @author chenliangsen
 * @date 2020/1/7 10:33
 */
public class PreFeeRequestModel extends RequestModel {
    /**
     * 约定具体的业务类型
     */
    public final static String FEE_TYPE = "preFee";
    /**
     * 通过构造方法把具体的业务类型传递进来
     */
    public PreFeeRequestModel() {
        super(FEE_TYPE);
    }

    /**
     * 申请人
     */
    private String user;

    /**
     * 申请金额
     */
    private double fee;

    public static String getFeeType() {
        return FEE_TYPE;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
