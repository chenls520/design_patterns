package com.design.patterns.facade.test1;

/**
 * @author chenliangsen
 * @date 2019/12/10 19:38
 */
public class Client {
    public static void main(String[] args) {
        //现在没有配置文件，直接使用默认的配置，通常情况下，三层都应该生成
        //也就是说客户端必须对这些模块都有了解，才能够正确使用它们
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }

    //使用Facade
    public static void main2(String[] args) {
        /**
         * 客户端不需要知道内部实现。只需要跟Facade交互
         */
        new Facade().generate();
    }

    /**
     * 客户端知道太多东西了，如果某个模块变动需要修改客户端，这很麻烦
     */
}
