package com.design.patterns.memento.test4;

/**
 * @author chenliangsen
 * @date 2020/1/2 13:54
 */
public class SubstractCommand extends AbstractCommand {
    private int opeNum;

    public SubstractCommand(int opeNum) {
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        this.operation.substract(opeNum);
    }
}
