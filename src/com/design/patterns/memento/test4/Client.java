package com.design.patterns.memento.test4;


/**
 * @author chenliangsen
 * @date 2020/1/2 14:13
 */
public class Client {
    public static void main(String[] args) {
        OperationApi operation = new Operation();
        AddCommand addCmd = new AddCommand(5);
        SubstractCommand substractCmd = new SubstractCommand(3);

        addCmd.setOperation(operation);
        substractCmd.setOperation(operation);

        Calculator calculator = new Calculator();
        calculator.setAddCmd(addCmd);
        calculator.setSubstractCmd(substractCmd);

        calculator.addPressed();
        System.out.println("一次加法运算后的结果为 " + operation.getResult());
        calculator.substractPressed();
        System.out.println("一次减法运算后的结果为 " + operation.getResult());

        calculator.undoPressed();
        System.out.println("撤销一次后的结果 " + operation.getResult());
        calculator.undoPressed();
        System.out.println("再撤销一次后的结果 " + operation.getResult());

        calculator.redoPressed();
        System.out.println("恢复一次后的结果 " + operation.getResult());
        calculator.redoPressed();
        System.out.println("再恢复一次后的结果 " + operation.getResult());

    }
}
