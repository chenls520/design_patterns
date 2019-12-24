package com.design.patterns.command.test4;

/**
 * @author chenliangsen
 * @date 2019/12/24 10:03
 */
public class Client {
    public static void main(String[] args) {
        OperationApi operation = new Operation();
        AddCommand addCommand = new AddCommand(operation, 5);
        SubstractCommand substractCommand = new SubstractCommand(operation, 3);
        Calculator calculator = new Calculator();
        calculator.setAddCommand(addCommand);
        calculator.setSubstractCommand(substractCommand);

        calculator.addPressed();
        System.out.println("一次加法运算后的结果为：" + operation.getResult());
        calculator.substractPressed();
        System.out.println("一次减法运算后的结果为：" + operation.getResult());

        calculator.undoPressed();
        System.out.println("撤销一次后的结果为：" + operation.getResult());
        calculator.undoPressed();
        System.out.println("撤销一次后的结果为：" + operation.getResult());
        calculator.redoPressed();
        System.out.println("恢复操作一次的结果为：" + operation.getResult());
        calculator.redoPressed();
        System.out.println("再恢复操作一次后的结果为：" + operation.getResult());

    }

}
