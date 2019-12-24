package com.design.patterns.command.test5;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 菜单对象，是个宏命令对象
 * @author chenliangsen
 * @date 2019/12/24 10:38
 */
public class MenuCommand implements Command {
    /**
     * 用来记录组合本菜单的多道菜品，也就是多个命令对象
     */
    private Collection<Command> col = new ArrayList<Command>();

    /**
     * 点菜，把菜品加入到菜单中
     * @param command 客户点的菜
     */
    public void addCommand(Command command) {
        col.add(command);
    }
    @Override
    public void execute() {
        //执行菜单其实就是循环执行菜单里面的每个菜
        for (Command command : col) {
            command.execute();
        }
    }
}
