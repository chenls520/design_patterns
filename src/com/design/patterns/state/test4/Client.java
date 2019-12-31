package com.design.patterns.state.test4;



/**
 * @author chenliangsen
 * @date 2019/12/31 14:14
 */
public class Client {
    public static void main(String[] args) {
        VoteManager voteManager = new VoteManager();
        for (int i = 0; i < 9; i++) {
            voteManager.vote("u1", "A");
        }
    }
}
