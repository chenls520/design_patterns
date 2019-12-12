package com.design.patterns.abstractfactory.test4;

/**
 * @author chenliangsen
 * @date 2019/12/12 15:41
 */
public class XmlDetailDAOImpl implements OrderDetailDAO {
    @Override
    public void saveOrderDetail() {
        System.out.println("new in XmlDetailDAOImpl saveOrderDetail");
    }
}
