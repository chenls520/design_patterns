package com.design.patterns.visitor.test1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author chenliangsen
 * @date 2020/1/7 15:35
 */
public class Client {
    public static void main(String[] args) {
        Collection<Customer> colCustomer = preparedTestData();
        for (Customer cm : colCustomer) {
            cm.predilectionAnalyze();
            cm.worthAnalyze();
        }
    }

    private static Collection<Customer> preparedTestData() {
        Collection<Customer> colCutomer = new ArrayList<Customer>();

        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        colCutomer.add(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("CDE集团");
        colCutomer.add(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("张珊");
        colCutomer.add(cm3);
        return colCutomer;
    }
}
