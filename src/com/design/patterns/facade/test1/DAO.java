package com.design.patterns.facade.test1;

/**
 * 示意生成表现层的模块
 * @author chenliangsen
 * @date 2019/12/10 19:34
 */
public class DAO {
    public void generate() {
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if (cm.isNeedGenDAO()) {
            //按照要求去生成相应的代码，并保存文件
            System.out.println("正在生成数据层代码文件");
        }

    }

}
