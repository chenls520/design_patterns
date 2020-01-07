package com.design.patterns.chain_of_responsibility.test5;



/**
 * @author chenliangsen
 * @date 2020/1/7 10:07
 */
public class ProjectManager2 extends Handler {
    @Override
    public Object handleRequest(RequestModel rm) {
        if (PreFeeRequestModel.FEE_TYPE.equals(rm.getType())) {
            //表示预支差旅费用申请
            return myHandler(rm);
        } else {
            //其他的让父类去处理
            return super.handleRequest(rm);
        }
    }

    private Object myHandler(RequestModel rm) {
        PreFeeRequestModel frm = (PreFeeRequestModel) rm;
        String str = "";
        //项目经理的权限比较小，只能在500以内
        if (frm.getFee() < 500) {
            //为了测试，简单点，只同意小李的
            if ("小李".equals(frm.getUser())) {
                str = "项目经理同意" + frm.getUser() + "预支差旅费用" + frm.getFee() + "元的请求";
            } else {
                //其他人一律不同意
                str = "项目经理不同意" + frm.getUser() + "预支差旅费用" + frm.getFee() + "元的请求";
            }
            return str;
        } else {
            //超过500，继续传递给级别更高的人处理
            if (this.successor != null) {
                return successor.handleRequest(rm);
            }
        }
        return str;

    }
}
