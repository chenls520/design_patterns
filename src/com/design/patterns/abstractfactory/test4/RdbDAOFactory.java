package com.design.patterns.abstractfactory.test4;

/**
 * @author chenliangsen
 * @date 2019/12/12 15:49
 */
public class RdbDAOFactory extends DAOFactory{
    @Override
    public OrderMainDAO createOrderMainDAO() {
        return new RdbMainDaoImpl();
    }

    @Override
    public OrderDetailDAO createOrderDetailDAO() {
        return new RdbDetailDAOImpl();
    }
}
