package com.design.patterns.state.test3;


/**
 *
 * @author chenliangsen
 * @date 2019/12/31 14:26
 */
public class RepeatVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票
        //暂时不做处理
        System.out.println("请不要重复投票");
    }
}
