package com.design.patterns.abstractfactory.test4;

/**
 * @author chenliangsen
 * @date 2019/12/12 15:50
 */
public class Client {
    public static void main(String[] args) {
        //创建DAO的抽象工厂
        DAOFactory df = new RdbDAOFactory();
        //通过抽象工厂来获取需要的DAO接口
        OrderDetailDAO orderDetailDAO = df.createOrderDetailDAO();
        OrderMainDAO orderMainDAO = df.createOrderMainDAO();
        //调用DAO来完成数据存储的功能
        orderDetailDAO.saveOrderDetail();
        orderMainDAO.saveOrderMain();
    }
}
