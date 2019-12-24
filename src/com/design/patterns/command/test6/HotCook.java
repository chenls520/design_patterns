package com.design.patterns.command.test6;

/**
 * 厨师对象，做热菜的厨师
 * @author chenliangsen
 * @date 2019/12/24 11:20
 */
public class HotCook implements CookApi, Runnable {
    /**
     * 厨师姓名
     */
    private String name;

    /**
     * 构造方法，传入厨师姓名
     * @param name 厨师姓名
     */
    public HotCook(String name) {
        this.name = name;
    }

    @Override
    public void cook(int tableNum, String name) {
        int cookTime = (int) (20 * Math.random());
        System.out.println(this.name + " 厨师正在为" + tableNum + " 号桌做：" + name);
        try {
            //让线程休息一会，表示正在做菜
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + " 厨师为" + tableNum + " 号桌做好了：" + name
        + ", 共计耗时=" + cookTime + "秒");
    }

    @Override
    public void run() {
        while (true) {
            //从命令队列里面获取命令对象
            Command oneCommand = CommandQueue.getOneCommand();
            if (oneCommand != null) {
                //说明取到命令对象了，这个命令对象还没有设置接收者
                //因为前面还不知道到底哪一个厨师来真正执行这个命令
                //现在知道了，就是当前厨师实例，设置到命令对象里面
                oneCommand.setCookApi(this);
                //然后真正执行这个命令
                oneCommand.execute();
            }
            //休息1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
