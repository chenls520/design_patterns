package com.design.patterns.visitor.test3;

/**
 * @author chenliangsen
 * @date 2020/1/7 16:25
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        os.addElement(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("CDE公司");
        os.addElement(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("张珊");
        os.addElement(cm3);

        ServiceRequestVisitor visitor = new ServiceRequestVisitor();
        os.handleRequest(visitor);

        PredilectionAnalyzeVisitor analyzeVisitor = new PredilectionAnalyzeVisitor();
        os.handleRequest(analyzeVisitor);


        WorthAnalyzeVisitor worthAnalyzeVisitor = new WorthAnalyzeVisitor();
        os.handleRequest(worthAnalyzeVisitor);
    }
}
