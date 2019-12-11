package com.design.patterns.simple_factory.test1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 工厂类，用来创建Api对象
 * 通过配置文件读取条件
 * @author chenliangsen
 * @date 2019/12/10 19:14
 */
public class PropertiesFactory {
    public static Api createApi() {
        Properties p = new Properties();
        InputStream in = null;
        in = PropertiesFactory.class.getResourceAsStream("FactoryTest.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            System.out.println("装载工厂配置文件出错了，具体的堆栈信息如下：");
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //用反射去创建，那些例外处理等完善的工作这里就不做了
        Api api = null;
        try {
            api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
