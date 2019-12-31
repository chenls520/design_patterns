package com.design.patterns.template_method.test1;

/**
 * 普通用户登录控制的逻辑处理
 * @author chenliangsen
 * @date 2019/12/26 9:27
 */
public class NoramlLogin {
    /**
     * 判断登录数据是否正确，也就是是否登录成功
     * @param loginModel 封装登录数据的Model
     * @return true 表示登录成功， false表示登录失败
     */
    public boolean login(LoginModel loginModel) {
        //1.从数据库获取登录人员的信息，就是根据用户编号去获取人员的数据
        UserModel um = this.findUserByUserId(loginModel.getUserId());
        //2.判断从前台传递过来的登录数据和数据库中已有的数据是否匹配
        //先判断用户是否存在，如果um为null，说明用户肯定不存在
        //但是不为null，用户不一定存在，因为数据层可能放回new UserModel()
        //因此还需要做进一步的判断
        if (um != null) {
            //如果用户存在，检查用户编号和密码是否匹配
            if (um.getUserId().equals(loginModel.getUserId())
                    && um.getPwd().equals(loginModel.getPwd())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 根据用户编号获取用户的详细信息
     * @param userId 用户编号
     * @return 对应的用户的详细信息
     */
    private UserModel findUserByUserId(String userId) {
        //这里省略具体的处理，仅做示意，返回一个有默认数据的对象
        UserModel userModel = new UserModel();
        userModel.setUserId(userId);
        userModel.setName("test");
        userModel.setPwd("test");
        userModel.setUuid("user001");
        return userModel;
    }
}
