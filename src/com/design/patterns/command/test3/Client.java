package com.design.patterns.command.test3;


/**
 * @author chenliangsen
 * @date 2019/12/23 16:37
 */
public class Client {
    public static void main(String[] args) {
        //1. 把命令和真正的实现组合起来，相当于在组装机器
        //把机箱上按钮的连接线插接到主板上
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);
        ResetCommand resetCommand = new ResetCommand(mainBoard);
        //2.为机箱上的按钮设置对应的命令，让按钮知道该干什么
        Box box = new Box();
        box.setOpenComand(openCommand);
        box.setResetCommand(resetCommand);
        System.out.println("正确配置下");
        //3.然后模拟按下机箱上的按钮
        System.out.println(">>>按下开机按钮<<<");
        box.openButtonPressed();
        System.out.println(">>>按下重启按钮<<<");
        box.resetButtonPressed();
        System.out.println("===================================");
        box.setOpenComand(resetCommand);
        box.setResetCommand(openCommand);
        System.out.println("错误配置下");
        System.out.println(">>>按下开机按钮<<<");
        box.openButtonPressed();
        System.out.println(">>>按下重启按钮<<<");
        box.resetButtonPressed();
    }
}
