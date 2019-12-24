package com.design.patterns.command.test5;

/**
 * 命令对象，白肉
 * @author chenliangsen
 * @date 2019/12/24 10:36
 */
public class PorkCommand implements Command {
    /**
     * 持有具体做菜的厨师的对象
     */
    private CookApi cookApi = null;

    /**
     * 设置具体做菜的厨师的对象
     * @param cookApi 具体做菜的厨师的对象
     */
    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        this.cookApi.cook("白肉");
    }
}
