package com.design.patterns.prototype.test4;

/**
 * 产品对象
 * @author chenliangsen
 * @date 2019/12/17 17:13
 */
public class Product implements Cloneable {
    /**
     * 产品编号
     */
    private String productId;
    /**
     * 产品名称
     */
    private String name;

    public Product(String productId, String name) {
        this.productId = productId;
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "产品编号=" + this.productId + ", 产品名称=" + this.name;
    }

    @Override
    protected Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
