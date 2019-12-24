package com.design.patterns.command.test1;

/**
 * 调用者
 * @author chenliangsen
 * @date 2019/12/23 16:12
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command = null;

    /**
     * 设置调用者持有的命令对象
     * @param command 命令对象
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 示意方法，要求命令执行请求
     */
    public void runCommand() {
        //调用命令对象的执行方法
        command.execute();
    }
}
