package com.design.patterns.visitor.test3;

/**
 * 具体的访问者，实现对客户价值分析
 * @author chenliangsen
 * @date 2020/1/7 16:29
 */
public class WorthAnalyzeVisitor implements Visitor{

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer ec) {
        System.out.println("现在对企业客户" + ec.getName() + "进行价值分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("现在对个人客户" + pc.getName() + "进行价值分析");
    }
}
