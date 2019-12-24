package com.design.patterns.command.test6;


import java.util.ArrayList;
import java.util.List;

/**
 * 命令队列类
 * @author chenliangsen
 * @date 2019/12/24 11:10
 */
public class CommandQueue {
    /**
     * 用来存储命令对象的队列
     */
    private static List<Command> cmds = new ArrayList<Command>();

    /**
     * 服务员传过来一个新的菜单，需要同步
     * 因为会有很多的服务员传入菜单，而同时又有很多厨师在队列里取值
     * @param menu 传入的菜单
     */
    public synchronized static void addMenu(MenuCommand menu) {
        //一个菜单中包含很多个命令对象
        for (Command command : menu.getCol()) {
            cmds.add(command);
        }
    }

    /**
     * 厨师从命令队列里面获取命令对象进行处理，也是需要同步的
     * @return
     */
    public synchronized static Command getOneCommand() {
        Command cmd = null;
        if (cmds.size() > 0) {
            //取出队列的第一个，因为是约定的按照加入的先后来处理
            cmd = cmds.get(0);
            //同时从队列里面去掉这个命令对象
            cmds.remove(0);
        }
        return cmd;
    }

}
