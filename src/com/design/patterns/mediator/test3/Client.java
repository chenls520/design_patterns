package com.design.patterns.mediator.test3;

/**
 * @author chenliangsen
 * @date 2019/12/18 11:46
 */
public class Client {
    public static void main(String[] args) {
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        Dep dep = new Dep();
        dep.setDepId("d1");
        Dep dep2 = new Dep();
        dep.setDepId("d2");
        User user = new User();
        user.setUserId("u1");

        mediator.showUserDeps(user);
    }
}
