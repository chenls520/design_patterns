package com.design.patterns.mediator.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现部门和人员交互的中介者实现类
 * 说明，为了演示的简洁性，只示例实现撤销部门和人员离职的功能
 * @author chenliangsen
 * @date 2019/12/18 11:16
 */
public class DepUserMediatorImpl {
    private static DepUserMediatorImpl mediator = new DepUserMediatorImpl();
    private DepUserMediatorImpl() {
        //调用初始化测试数据的功能
        initTestData();
    }

    public static DepUserMediatorImpl getInstance() {
        return mediator;
    }

    public List<DepUserModel> depUserModels = new ArrayList<>();

    /**
     * 初始化测试数据
     */
    public void initTestData() {
        DepUserModel du1 = new DepUserModel();
        du1.setUserId("u1");
        du1.setDepId("d1");
        du1.setDepUserId("du1");
        depUserModels.add(du1);

        DepUserModel du2 = new DepUserModel();
        du1.setUserId("u2");
        du1.setDepId("d1");
        du1.setDepUserId("du2");
        depUserModels.add(du2);

        DepUserModel du3 = new DepUserModel();
        du1.setUserId("u3");
        du1.setDepId("d2");
        du1.setDepUserId("du3");
        depUserModels.add(du3);

        DepUserModel du4 = new DepUserModel();
        du1.setUserId("u4");
        du1.setDepId("d2");
        du1.setDepUserId("du4");
        depUserModels.add(du4);

        DepUserModel du5 = new DepUserModel();
        du1.setUserId("u1");
        du1.setDepId("d2");
        du1.setDepUserId("du5");
        depUserModels.add(du5);
    }

    public boolean deleteDep(String depId) {
        List<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du : depUserModels) {
            if (du.getDepId().equals(depId)) {

                tempCol.add(du);
            }
        }
        depUserModels.removeAll(tempCol);
        return true;
    }

    public boolean deleteUser(String userId) {
        List<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du : depUserModels) {
            if (du.getUserId().equals(userId)) {
                tempCol.add(du);
            }
        }
        depUserModels.removeAll(tempCol);
        return true;
    }

    public void showDepUsers(Dep dep) {
        for (DepUserModel du : depUserModels) {
            if (du.getDepId().equals(dep.getDepId())) {
                System.out.println("部门编号=" + dep.getDepId() +
                        ",下面拥有人员，编号是：" + du.getUserId());
            }
        }
    }

    public void showUserDeps(User user) {
        for (DepUserModel du : depUserModels) {
            if (du.getUserId().equals(user.getUserId())) {
                System.out.println("人员编号=" + user.getUserId() +
                        ",属于部门编号是：" + du.getDepId());
            }
        }
    }
}
