package com.design.patterns.flyweight.test4;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 享元工厂，通常实现成为单例
 * 加入实现垃圾回收和引用计数的功能
 *
 * @author chenliangsen
 * @date 2020/1/3 13:52
 */
public class FlyweightFactory {
    private static FlyweightFactory factory =
            new FlyweightFactory();

    private FlyweightFactory() {
        //启动清除缓存值得线程
        Thread thread = new ClearCache();
        thread.start();
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    /**
     * 缓存多个Flyweight对象
     */
    private Map<String, Flyweight> fsMap =
            new HashMap<String, Flyweight>();

    /**
     * 用来缓存被共享对象的缓存配置，key值和上面的Map一样
     */
    private Map<String, CacheConfModel> cacheCofMap =
            new HashMap<String, CacheConfModel>();

    /**
     * 用来记录缓存对象被引用的次数，key值和上面Map的一样
     */
    private Map<String, Integer> countMap =
            new HashMap<String, Integer>();

    /**
     * 默认保存6秒钟，主要为了测试方便，这个时间可以根据应用的要求来设置
     */
    private final long DURABLE_TIME = 6 * 1000L;

    /**
     * 获取某个享元被使用的次数
     * @param key 享元的key
     * @return 被使用的次数
     */
    public synchronized int getUseTimes(String key) {
        Integer count = countMap.get(key);
        if (count == null) {
            count = 0;
        }
        return count;
    }

    /**
     * 获取key对应的享元对象
     * @param key 获取享元对象的key
     * @return key对应的享元对象
     */
    public synchronized Flyweight getFlyweight(String key) {
        Flyweight f = fsMap.get(key);
        if (f == null) {
            f = new AuthorizationFlyweight(key);
            fsMap.put(key, f);
            //同事设置引用计数
            countMap.put(key, 1);
            //同时设置缓存配置数据
            CacheConfModel cm = new CacheConfModel();
            cm.setBeginTime(System.currentTimeMillis());
            cm.setForever(false);
            cm.setDurableTime(DURABLE_TIME);

            cacheCofMap.put(key, cm);
        } else {
            //表示还在使用，那么应该重新设置缓存配置
            CacheConfModel cm = cacheCofMap.get(key);
            cm.setBeginTime(System.currentTimeMillis());
            //设置回去
            this.cacheCofMap.put(key, cm);
            //同事计数加1
            Integer count = countMap.get(key);
            count++;
            countMap.put(key, count);
        }
        return f;
    }

    /**
     * 删除key对应的享元对象，连带清除对应的缓存配置和引用次数的记录，不对外
     * @param key 要删除的享元对象的key
     */
    private synchronized void removeFlyweight(String key) {
        this.fsMap.remove(key);
        this.cacheCofMap.remove(key);
        this.countMap.remove(key);
    }

    /**
     * 维护清除缓存的线程，内部使用
     */
    private class ClearCache extends Thread {
        @Override
        public void run() {
            while (true) {
                Set<String> tempSet = new HashSet<String>();
                Set<String> set = cacheCofMap.keySet();
                for (String key : set) {
                    CacheConfModel ccm = cacheCofMap.get(key);
                    //比较是否需要清除
                    if ((System.currentTimeMillis() - ccm.getBeginTime())
                            >= ccm.getDurableTime()) {
                        //可以清除，先记录下来
                        tempSet.add(key);
                    }
                }
                //真正清除
                for (String key : tempSet) {
                    FlyweightFactory.getInstance().removeFlyweight(key);
                }
                System.out.println("now thread= " + fsMap.size()
                        + ", fsMap=" + fsMap.keySet());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
