package com.design.patterns.proxy.test3;

import java.util.Collection;

/**
 * @author chenliangsen
 * @date 2019/12/19 10:36
 */
public class Client {
    public static void main(String[] args) throws Exception {
        UserManager userManager = new UserManager();
        Collection<UserModelApi> col = userManager.getUserByDepId("0101");
        for (UserModelApi umApi : col) {
            System.out.println("用户编号 " + umApi.getUserId()
            + ", 用户姓名 " + umApi.getName());
        }
        for (UserModelApi umApi : col) {
            System.out.println("用户编号 " + umApi.getUserId()
                    + ", 用户姓名 " + umApi.getName()
                    + ", 所属部门 " + umApi.getDepId());
        }
    }
}
