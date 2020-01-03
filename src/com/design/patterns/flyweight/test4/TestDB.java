package com.design.patterns.flyweight.test4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 供测试使用，在内存中模拟数据库中的值
 *
 * @author chenliangsen
 * @date 2020/1/3 9:37
 */
public class TestDB {
    /**
     * 用来存放授权数据的值
     */
    public static Collection<String> colDB = new ArrayList<String>();

    /**
     * 用来存放组合授权数据的值
     * key为组合数据的id，value为改组合包含的多条授权数据的值
     */
    public static Map<String, String[]> mapDB =
            new HashMap<String, String[]>();

    static{
        //通过静态代码块来填充模拟数据
        colDB.add("张珊,人员列表,查看,1");
        colDB.add("李四,人员列表,查看,1");
        colDB.add("李四,薪资数据,,2");
        mapDB.put("薪资数据", new String[]{"薪资数据,查看", "薪资数据,修改"});
        //增加更多的授权数据
        for (int i = 0; i < 3; i++) {
            colDB.add("张珊" + i + ",人员列表,查看,1");
        }

    }
}
