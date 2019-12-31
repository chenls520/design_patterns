package com.design.patterns.state.test3;

import java.util.HashMap;
import java.util.Map;

/**
 * 投票管理
 * @author chenliangsen
 * @date 2019/12/31 14:27
 */
public class VoteManager {
    /**
     * 持有状态处理的对象
     */
    private VoteState state = null;



    /**
     * 记录用户投票的结果 Map<String, String>对应Map<用户名称，投票的选项>
     */
    private Map<String, String> mapVote = new HashMap<String, String>();

    /**
     * 记录用户投票次数，Map<String,Integer>对应Map<用户名称，投票的次数>
     */
    private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();

    /**
     * 获取记录用户投票结果的Map
     * @return 记录用户投票结果的Map
     */
    public Map<String, String> getMapVote() {
        return mapVote;
    }



    /**
     * 投票
     * @param user 投票人，为了简单，就是用户名称
     * @param voteItem 投票的选项
     */
    public void vote(String user, String voteItem) {
        //先为该用户增加投票的次数
        //从记录中取出已有的投票次数
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount++;
        mapVoteCount.put(user, oldVoteCount);

        //判断用户投票的类型，到底是正常投票、重复投票、恶意投票
        //还是黑名单，然后根据投票类型来进行相应的操作
        if (oldVoteCount == 1) {
            state = new NormalVoteState();
        }else if (oldVoteCount > 1 && oldVoteCount < 5) {
            state = new RepeatVoteState();
        }else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            state = new SpiteVoteState();
        }else if (oldVoteCount >= 8) {
            state = new BlackVoteState();
        }
        state.vote(user, voteItem, this);
    }
}
