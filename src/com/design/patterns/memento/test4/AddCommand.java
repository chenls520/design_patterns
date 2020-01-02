package com.design.patterns.memento.test4;

/**
 * @author chenliangsen
 * @date 2020/1/2 13:54
 */
public class AddCommand extends AbstractCommand {
    private int opeNum;

    public AddCommand(int opeNum) {
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        this.operation.add(opeNum);
    }
}
