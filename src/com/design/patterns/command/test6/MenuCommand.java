package com.design.patterns.command.test6;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 菜单对象，是个宏命令对象
 * @author chenliangsen
 * @date 2019/12/24 11:12
 */
public class MenuCommand implements Command {
    /**
     * 用来记录组合本菜单的多道菜品，也就是多个命令对象
     */
    private Collection<Command> col = new ArrayList<Command>();

    /**
     * 点菜，把菜品加入到菜单中
     * @param cmd 客户点的菜
     */
    public void addCommand(Command cmd) {
        col.add(cmd);
    }
    @Override
    public void execute() {
        //执行菜单就是把菜单传递给后厨
        CommandQueue.addMenu(this);
    }

    /**
     * 获取菜单中的多个命令对象
     * @return 菜单中的多个命令对象
     */
    public Collection<Command> getCol() {
        return col;
    }

    @Override
    public void setCookApi(CookApi cookApi) {

    }

    @Override
    public int getTableNum() {
        return 0;
    }
}
