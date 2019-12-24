package com.design.patterns.iterator.test2;

import java.util.Iterator;
import java.util.List;

/**
 * @author chenliangsen
 * @date 2019/12/24 14:52
 */
public class Client {
    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        List payList = payManager.getPayList();
        Iterator it = payList.iterator();
        System.out.println("集团工资列表：");
        while (it.hasNext()) {
            PayModel pm = (PayModel) it.next();
            System.out.println(pm);
        }

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        PayModel[] pms = salaryManager.getPays();
        System.out.println("新收购的公司工资列表：");
        for (PayModel pm : pms) {
            System.out.println(pm);
        }
    }
}
