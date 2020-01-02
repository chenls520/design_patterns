package com.design.patterns.memento.test4;

/**
 * 命令对象的公共对象，实现各个命令对象的公共方法
 * @author chenliangsen
 * @date 2020/1/2 13:51
 */
public abstract class AbstractCommand implements Command{

    /**
     * 具体的功能实现，这里不管
     */
    public abstract void execute();

    /**
     * 持有真正的命令实现者对象
     */
    protected OperationApi operation = null;

    public void setOperation(OperationApi operation) {
        this.operation = operation;
    }

    @Override
    public Memento createMemento() {
        return this.operation.createMemento();
    }

    @Override
    public void redo(Memento memento) {
        this.operation.setMemento(memento);
    }

    @Override
    public void undo(Memento memento) {
        this.operation.setMemento(memento);
    }
}
