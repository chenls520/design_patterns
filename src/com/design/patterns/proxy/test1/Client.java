package com.design.patterns.proxy.test1;

import java.util.Collection;

/**
 * @author chenliangsen
 * @date 2019/12/19 10:18
 */
public class Client {
    public static void main(String[] args) throws Exception {
        UserManager userManager = new UserManager();
        Collection<UserModel> col = userManager.getUserByDepId("0101");
        System.out.println(col);
    }
}
