package com.design.patterns.memento.test1;

/**
 * @author chenliangsen
 * @date 2020/1/2 9:59
 */
public class Client {
    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock("testFlow");
        mock.runPhaseOne();

        int tempResult = mock.getTempResult();
        String tempState = mock.getTempState();

        mock.schema1();

        mock.setTempResult(tempResult);
        mock.setTempState(tempState);

        mock.schema2();
    }
}
