package com.design.patterns.abstractfactory.test4;

/**
 * @author chenliangsen
 * @date 2019/12/12 15:40
 */
public class XmlMainDaoImpl implements OrderMainDAO {
    @Override
    public void saveOrderMain() {
        System.out.println("now in XmlMainDaoImpl saveOrderMain");
    }
}
