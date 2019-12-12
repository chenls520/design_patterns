package com.design.patterns.abstractfactory.test4;

/**
 * @author chenliangsen
 * @date 2019/12/12 15:49
 */
public class XmlDAOFactory extends DAOFactory{
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new XmlMainDaoImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new XmlDetailDAOImpl();
    }
}
