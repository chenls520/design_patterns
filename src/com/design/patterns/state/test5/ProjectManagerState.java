package com.design.patterns.state.test5;

/**
 * 处理项目经理的审核，处理后可能对应部门经理审核或者审核结束之中的一种
 * @author chenliangsen
 * @date 2019/12/31 15:32
 */
public class ProjectManagerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine ctx) {
        //先把业务对象强转回来
        LeaveRequestModel lrm = (LeaveRequestModel) ctx.getBusinessVO();
        System.out.println("项目经理审核中，请稍后。。。");
        //模拟用户处理界面,通过控制台来读取数据
        System.out.println(lrm.getUser() + " 申请从" + lrm.getBeginDate()
        + "开始请假" + lrm.getLeaveDays() + "天，请项目经理审核（1 同意，2 不同意）：");
        //业务处理，把审核结果保存到数据库中
        //根据选择的结果和条件来设置下一步

        //根据选择的结果和条件来设置下一步
        if ("同意".equals(lrm.getResult())) {
            if (lrm.getLeaveDays() > 3) {
                //如果请假天数大于三天，而且项目经理同意了，就提交各部门经理
                ctx.setState(new DepManagerState());
                //为部门经理增加一个工作
            }else {
                //3天以内的请假，由项目经理做主，
                // 就不用提交给项目经理了，转向审核结束状态
                ctx.setState(new AuditOverState());
            }
        }else {
            //项目经理不同意的话，也就不用提交给部门经理了，转向审核结束状态
            ctx.setState(new AuditOverState());
            //给申请人增加一个工作，让他查看审核结果
        }
    }
}
