package com.design.patterns.command.test5;

/**
 * 服务员，负责组合菜单，负责组装每个菜和具体的实现者
 * 还负责执行调用，相当于Command模式的Client+Invoker
 * @author chenliangsen
 * @date 2019/12/24 10:40
 */
public class Waiter {
    /**
     * 持有一个宏命令对象--菜单
     */
    private MenuCommand menuCommand = new MenuCommand();

    /**
     * 客户点菜
     * @param command 客户点菜，每道菜就是一个命令对象
     */
    public void orderDish(Command command) {
        CookApi hotCook = new HotCook();
        CookApi coolCook = new CoolCook();

        if (command instanceof ChopCommand) {
            ((ChopCommand)command).setCookApi(hotCook);
        }else if (command instanceof PorkCommand) {
            ((PorkCommand)command).setCookApi(coolCook);
        }else if (command instanceof DuckCommand) {
            ((DuckCommand)command).setCookApi(hotCook);
        }

        //添加到菜单中
        menuCommand.addCommand(command);
    }

    /**
     * 客户点菜完毕，表示要执行命令了，这里就是执行菜单这个组合命令
     */
    public void orderOver() {
        this.menuCommand.execute();
    }
}
