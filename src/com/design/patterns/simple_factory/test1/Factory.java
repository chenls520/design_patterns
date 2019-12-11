package com.design.patterns.simple_factory.test1;

/**
 * 工厂类，用来创建Api对象
 * @author chenliangsen
 * @date 2019/12/10 19:01
 */
public class Factory {
    /**
     *
     * 具体创建Api对象的方法
     * @param condition 示意，从外部传入的选择条件
     * @return 创建好的Api对象
     */
    public static Api createApi(int condition) {
//        应该根据某些条件去选择究竟创建哪一个具体的实现对象
//        这些条件可以从外部传入，也可以从其他途径来获取（如客户端、配置文件、运行时变量）
//        如果只有一个实现，可以省略条件，应为没有选择的必要
//        示意使用条件
        Api api = null;
        if (condition == 1) {
            api = new ImplA();
        } else if (condition == 2) {
            api = new ImplB();
        }
        return api;
    }

    /**
     * 注意事项，如果新增实现类需要修改工厂类
     * 解决方案：配置文件配置实现类，通过反射（或者Ioc容器）获取实现类对象
     * 实现见 PropertiesFactory
     */
}
