package com.design.patterns.prototype.test4;

import com.design.patterns.prototype.test3.OrderApi;

/**
 * @author chenliangsen
 * @date 2019/12/17 17:18
 */
public class PersonalOrder implements Cloneable, OrderApi {
    /**
     * 订购人员姓名
     */
    private String customerName;
    /**
     * 产品编号
     */
    private String productId;

    /**
     * 订单产品数量
     */
    private int orderProductNum = 0;

    private Product product = null;
    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int num) {
        this.orderProductNum = num;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "本个人订单的订购人是=" + this.customerName + ", 订购产品是=" + this.productId
                + ", 订购数量为=" + this.orderProductNum + ", 产品=" + this.product;
    }


    @Override
    public OrderApi clone() {
        PersonalOrder obj = null;
        try {
            obj = (PersonalOrder) super.clone();
            obj.setProduct((Product) this.product.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
