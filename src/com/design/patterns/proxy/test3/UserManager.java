package com.design.patterns.proxy.test3;

import com.design.patterns.proxy.test1.UserModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 实现示例要求的功能
 * @author chenliangsen
 * @date 2019/12/19 10:33
 */
public class UserManager {
    private Connection connection;

    /**
     * 根据部门编号来获取该部门下的所有人员
     *
     * @param depId 部门编号
     * @return 该部门下的所有人员
     */
    public Collection<UserModelApi> getUserByDepId(String depId) throws Exception {
        Collection<UserModelApi> col = new ArrayList<UserModelApi>();
        Connection conn = null;
        try {
            conn = this.getConnection();
            String sql = "select u.userId, u.name from tb1_user u, tb1_dep d" +
                    " where u.depId = d.depId and d.depId like ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, depId + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Proxy proxy = new Proxy(new UserModel());
                proxy.setUserId(rs.getString("userId"));
                proxy.setName(rs.getString("name"));
                proxy.setDepId(rs.getString("depId"));
                proxy.setSex(rs.getString("sex"));

                col.add(proxy);
            }
            rs.close();
            pstmt.close();
        } finally {
            conn.close();
        }
        return col;
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
