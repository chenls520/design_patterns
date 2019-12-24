package com.design.patterns.iterator.test3;

/**
 * @author chenliangsen
 * @date 2019/12/24 15:42
 */
public class Client {
    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        System.out.println("集团工资列表");
        test(payManager.createIterator());
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("新收购的公司工资列表");
        test(salaryManager.createIterator());
    }

    private static void test(Iterator iterator) {
        iterator.first();
        while (!iterator.isDone()) {
            Object o = iterator.currentItem();
            System.out.println("this obj =  " + o);
            iterator.next();
        }
    }
}
