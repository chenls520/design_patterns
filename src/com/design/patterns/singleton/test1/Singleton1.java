package com.design.patterns.singleton.test1;

/**
 * 懒汉式单例实现的示例
 * @author chenliangsen
 * @date 2019/12/11 10:24
 */
public class Singleton1 {
    /**
     * 定义一个变量来存储创建好的类实例
     * 因为这个变量要在静态方法中使用，所有要加上static修饰
     */
    private static Singleton1 uniqueInstance = null;

    /**
     * 私有化构造方法，可以在内部控制创建实例的数目
     */
    private Singleton1() {
    }

    /**
     * 定义一个方法来为客户端提供类实例
     * 效率低
     * @return
     */
    public static synchronized Singleton1 getInstance1() {
        //判断存储实例的变量是否有值
        if (uniqueInstance == null) {
            //如果没有，就创建一个类实例，并把值赋值给存储类实例的变量
            uniqueInstance = new Singleton1();
        }
        //如果有值，那就直接使用
        return uniqueInstance;
    }

    /**
     * 双重锁检测机制，效率不是很高
     * 定义一个方法来为客户端提供类实例
     * uniqueInstance 需要添加volatile修饰
     * @return
     */
    public static Singleton1 getInstance2() {
        //判断存储实例的变量是否有值
        if (uniqueInstance == null) {
            synchronized(Singleton1.class){
                if (uniqueInstance == null) {
                    //如果没有，就创建一个类实例，并把值赋值给存储类实例的变量
                    uniqueInstance = new Singleton1();
                }
            }

        }
        //如果有值，那就直接使用
        return uniqueInstance;
    }

    /**
     * 静态内部类，效率高
     * 定义一个方法来为客户端提供类实例
     * @return
     */
    public static Singleton1 getInstance3() {
        return SingletonHolder.instance;
    }

    public static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton1 instance = new Singleton1();
    }

    //示意方法，单例可以有自己的操作
    public void singletonOperation() {
        //功能处理
    }

    //示意属性，单例可以有自己的属性
    private String singletonData;

    /**
     *
     * 示意方法，让外部通过这些方法来访问属性的值
     * @return 属性的值
     */
    public String getSingletonData() {
        return singletonData;
    }
}
