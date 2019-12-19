package com.design.patterns.proxy.test3;

import com.design.patterns.proxy.test1.UserModel;

import java.sql.*;

/**
 * 代理对象，代理用户数据对象
 * @author chenliangsen
 * @date 2019/12/19 10:22
 */
public class Proxy implements UserModelApi {
    /**
     * 持有被代理的具体的目标对象
     */
    private UserModel realSubject = null;

    /**
     * 构造方法，传入被代理的具体的目标对象
     * @param realSubject 被代理的具体的目标对象
     */
    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    /**
     * 标示是否已经重新装载过数据了
     */
    private boolean loaded = false;

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getDepId() {
        //需要判断是否已经装载过了
        if (!this.loaded) {
            //从数据库中重新装载
            reload();
            //设置重新装载的标志为ture
            this.loaded = true;
        }
        return realSubject.getDepId();
    }

    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        //需要判断是否已经装载过了
        if (!this.loaded) {
            //从数据库中重新装载
            reload();
            //设置重新装载的标志为ture
            this.loaded = true;
        }
        return realSubject.getSex();
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    /**
     * 重新查询数据库以获取完整的用户数据
     */
    private void reload() {
        System.out.println("重新查询数据库获取完整的用户数据,userId==" + realSubject.getUserId());
        Connection conn = null;
        try {
            conn = this.getConnection();
            String sql = "select * from tb1_user where userId = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, realSubject.getUserId());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                realSubject.setDepId(rs.getString("depId"));
                realSubject.setSex(rs.getString("sex"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "userId = " + getUserId() + ", name=" + getName()
                + ", depId=" + getDepId() + ", sex=" + getSex();
    }

    /**
     * 获取与数据库的连接
     * @return 数据库连接
     * @throws Exception
     */
    private Connection getConnection() throws Exception{
        Class.forName("你使用的数据库对应的JDBC驱动类");
        return DriverManager.getConnection("连接数据库的URL", "用户名", "密码");
    }

}
