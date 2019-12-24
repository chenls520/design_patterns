package com.design.patterns.command.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算器类，计算器上有加法按钮、减法按钮
 * @author chenliangsen
 * @date 2019/12/24 9:51
 */
public class Calculator {
    /**
     * 持有执行加法的命令对象
     */
    private Command addCommand = null;
    /**
     * 持有执行减法的命令对象
     */
    private Command substractCommand = null;

    /**
     * 设置执行加法的命令对象
     * @param addCommand 执行加法的命令对象
     */
    public void setAddCommand(Command addCommand) {
        this.addCommand = addCommand;
    }

    /**
     * 设置执行减法的命令对象
     * @param substractCommand 执行减法的命令对象
     */
    public void setSubstractCommand(Command substractCommand) {
        this.substractCommand = substractCommand;
    }

    /**
     * 提供给客户使用，执行加法功能
     */
    public void addPressed() {
        this.addCommand.execute();
        //把操作记录到历史记录里面
        undoCmds.add(this.addCommand);
    }

    /**
     * 提供给客户使用，执行减法功能
     */
    public void substractPressed() {
        this.substractCommand.execute();
        //把操作记录到历史记录里面
        undoCmds.add(this.substractCommand);
    }

    public void undoPressed() {
        if (this.undoCmds.size() > 0) {
            //取出最后一个命令来撤销
            Command command = this.undoCmds.get(this.undoCmds.size() - 1);
            command.undo();
            //如果还有恢复功能，那就把这个命令记录到恢复的历史记录里面
            this.redoCmds.add(command);
            //然后把最有一个命令删除掉
            this.undoCmds.remove(command);
        }else {
            System.out.println("很抱歉，没有可撤销的命令");
        }
    }

    public void redoPressed() {
        if (this.redoCmds.size() > 0) {
            //取出最有一个命令来恢复
            Command command = this.redoCmds.get(this.redoCmds.size() - 1);
            command.execute();
            //把这个命令记录到可撤销的历史记录里面
            this.undoCmds.add(command);
            //然后把最有一个命令删除掉
            this.redoCmds.remove(command);
        }else {
            System.out.println("很抱歉，没有可恢复的命令");
        }
    }

    /**
     * 命令操作的历史记录，在撤销的时候用
     */
    private List<Command> undoCmds = new ArrayList<Command>();

    /**
     * 命令撤销的历史记录，在恢复时用
     */
    private List<Command> redoCmds = new ArrayList<Command>();

}
