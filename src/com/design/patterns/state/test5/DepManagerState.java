package com.design.patterns.state.test5;

/**
 * 处理部门经理的审核，处理后对应审核结束的状态
 * @author chenliangsen
 * @date 2019/12/31 15:49
 */
public class DepManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine ctx) {
        LeaveRequestModel lrm = (LeaveRequestModel) ctx.getBusinessVO();
        //业务处理，把审核结果保存到数据库中

        //部门经理审核以后，直接转向审核结束状态了
        ctx.setState(new AuditOverState());
        //给申请人增加一个工作，让他看审核结果
        ctx.doWork();
    }
}
