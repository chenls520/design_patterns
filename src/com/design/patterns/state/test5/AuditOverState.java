package com.design.patterns.state.test5;

/**
 * 处理审核结束的类
 * @author chenliangsen
 * @date 2019/12/31 15:50
 */
public class AuditOverState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine ctx) {
        LeaveRequestModel lrm = (LeaveRequestModel) ctx.getBusinessVO();
        //业务处理，在数据中记录整个流程结束
    }
}
