package com.design.patterns.command.test2;

/**
 * 开机命令的实现，实现command接口
 * 持有开机命令的真正实现，通过调用接收者的方法来实现命令
 * @author chenliangsen
 * @date 2019/12/23 16:22
 */
public class OpenCommand implements Command {
    /**
     * 持有真正实现命令的接收者--主板对象
     */
    private MainBoardApi mainBoard = null;

    /**
     * 构造方法，传入主板对象
     * @param mainBoard 主板对象
     */
    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void execute() {
        //对于命令对象，根本不知道如何开机，会转调主板对象
        //让主板去完成开机的功能
        this.mainBoard.open();
    }
}
