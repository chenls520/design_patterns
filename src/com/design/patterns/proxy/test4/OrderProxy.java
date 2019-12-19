package com.design.patterns.proxy.test4;

/**
 * 订单的代理对象
 * @author chenliangsen
 * @date 2019/12/19 10:59
 */
public class OrderProxy implements OrderApi {
    /**
     * 持有被代理的具体的目标对象
     */
    private Order order = null;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param order 被代理的具体的目标对象
     */
    public OrderProxy(Order order) {
        this.order = order;
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }

    @Override
    public void setProductName(String productName, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            order.setProductName(productName, user);
        }else {
            System.out.println("对不起" + user + ", 您没有权限");
        }
    }

    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderNum(orderNum, user);
        }else {
            System.out.println("对不起" + user + ", 您没有权限");
        }
    }

    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if (user != null && user.equals(this.getOrderUser())) {
            order.setOrderUser(orderUser, user);
        }else {
            System.out.println("对不起" + user + ", 您没有权限");
        }
    }

    @Override
    public String toString() {
        return this.order.toString();
    }
}
