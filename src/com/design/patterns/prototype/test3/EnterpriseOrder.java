package com.design.patterns.prototype.test3;


/**
 *  企业订单对象
 * @author chenliangsen
 * @date 2019/12/17 14:32
 */
public class EnterpriseOrder implements OrderApi{

    /**
     * 企业名称
     */
    private String enterpriseName;
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;
    @Override
    public int getOrderProductNum() {
        return this.orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    @Override
    public OrderApi clone() {
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(this.enterpriseName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);
        return order;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "本企业订单的订购人是=" + this.enterpriseName + ", 订购产品是=" + this.productId
                + ", 订购数量为=" + this.orderProductNum;
    }
}
