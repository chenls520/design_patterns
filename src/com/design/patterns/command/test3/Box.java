package com.design.patterns.command.test3;


/**
 * 机箱对象，本身有按钮，持有按钮对应的命令对象
 * @author chenliangsen
 * @date 2019/12/23 16:33
 */
public class Box {
    /**
     * 开机命令对象
     */
    private Command openComand;

    /**
     * 设置开机命令对象
     * @param openComand 开机命令对象
     */
    public void setOpenComand(Command openComand) {
        this.openComand = openComand;
    }

    /**
     * 提供给客户使用，接收并相应用户请求，相当于按钮被按下触发的方法
     */
    public void openButtonPressed() {
        //按下按钮，执行命令
        openComand.execute();
    }

    /**
     * 重启机器命令对象
     */
    public Command resetCommand = null;

    /**
     * 设置重启机器命令对象
     * @param resetCommand
     */
    public void setResetCommand(Command resetCommand) {
        this.resetCommand = resetCommand;
    }

    /**
     * 提供给用户使用，接收并响应用户请求，相当于重启按钮被按下触发的方法
     */
    public void resetButtonPressed() {
        //按下按钮，执行命令
        resetCommand.execute();
    }
}
