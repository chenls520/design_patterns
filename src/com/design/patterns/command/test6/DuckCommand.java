package com.design.patterns.command.test6;


/**
 * 命令对象，绿豆排骨汤
 * @author chenliangsen
 * @date 2019/12/24 10:36
 */
public class DuckCommand implements Command {
    /**
     * 持有具体做菜的厨师的对象
     */
    private CookApi cookApi = null;


    /**
     * 点菜的桌号
     */
    private int tableNum;

    /**
     * 构造方法，传入点菜的桌号
     * @param tableNum 点菜的桌号
     */
    public DuckCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        this.cookApi.cook(tableNum, "北京烤鸭");
    }

    /**
     * 设置具体做菜的厨师的对象
     * @param cookApi 具体做菜的厨师的对象
     */
    @Override
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }


    @Override
    public int getTableNum() {
        return this.tableNum;
    }
}
