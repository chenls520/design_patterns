package com.design.patterns.memento.test4;

/**
 * 定义一个命令的接口
 */
public interface Command {
    /**
     * 执行命令
     */
    public void execute();

    /**
     * 撤销命令，恢复到备忘录对象记录的状态
     * @param memento 备忘录对象
     */
    public void undo(Memento memento);

    /**
     * 重做命令，恢复到备忘录对象记录的状态
     * @param memento 备忘录对象
     */
    public void redo(Memento memento);

    /**
     * 创建保存原发器对象状态的备忘录对象
     * @return
     */
    public Memento createMemento();
}
