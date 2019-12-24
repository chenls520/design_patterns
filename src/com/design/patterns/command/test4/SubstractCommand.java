package com.design.patterns.command.test4;

/**
 * 具体的减法命令实现对象
 * @author chenliangsen
 * @date 2019/12/24 9:49
 */
public class SubstractCommand implements Command {
    /**
     * 持有具体执行计算的对象
     */
    private OperationApi operation = null;
    /**
     * 操作数据，也就是要加上的数据
     */
    private int opeNum;
    @Override
    public void execute() {
        this.operation.substract(opeNum);
    }

    @Override
    public void undo() {
        this.operation.add(opeNum);
    }

    public SubstractCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }
}
