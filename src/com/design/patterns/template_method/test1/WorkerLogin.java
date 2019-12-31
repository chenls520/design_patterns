package com.design.patterns.template_method.test1;

/**
 * 工作人员登录控制的逻辑处理
 * @author chenliangsen
 * @date 2019/12/26 9:37
 */
public class WorkerLogin {
    /**
     * 判断登录数据是否正确，也就是是否登录成功
     * @param loginModel 封装登录数据的Model
     * @return true 表示登录成功， false表示登录失败
     */
    public boolean login(LoginModel2 loginModel) {
        //1.从数据库获取登录人员的信息，就是根据用户编号去获取人员的数据
        WorkerModel wm = this.findUserByWorkerId(loginModel.getWorkerId());
        //2.判断从前台传递过来的登录数据和数据库中已有的数据是否匹配
        //先判断用户是否存在，如果um为null，说明用户肯定不存在
        //但是不为null，用户不一定存在，因为数据层可能放回new UserModel()
        //因此还需要做进一步的判断
        if (wm != null) {
            //如果用户存在，检查用户编号和密码是否匹配
            String encrptPwd = this.encryptPwd(loginModel.getPwd());
            if (wm.getWorkerId().equals(loginModel.getWorkerId())
                    && wm.getPwd().equals(encrptPwd)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 对密码数据进行加密
     * @param pwd 密码数据
     * @return 加密后的密码数据
     */
    private String encryptPwd(String pwd) {
        //这里对密码进行加密，省略了
        return pwd;
    }

    /**
     * 根据工作人员编号获取工作人员的详细信息
     * @param workerId 工作人员编号
     * @return 对应的工作人员的详细信息
     */
    private WorkerModel findUserByWorkerId(String workerId) {
        //这里省略具体的处理，仅做示意，返回一个有默认数据的对象
        WorkerModel workerModel = new WorkerModel();
        workerModel.setWorkerId(workerId);
        workerModel.setName("test");
        workerModel.setPwd("test");
        workerModel.setUuid("user001");
        return workerModel;
    }
}
