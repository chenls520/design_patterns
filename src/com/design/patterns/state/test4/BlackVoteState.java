package com.design.patterns.state.test4;



/**
 *
 * @author chenliangsen
 * @date 2019/12/31 14:26
 */
public class BlackVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //黑名单
        //记录黑名单，禁止登陆系统了
        System.out.println("进入黑名单，将禁止登陆和使用本系统");
    }
}
