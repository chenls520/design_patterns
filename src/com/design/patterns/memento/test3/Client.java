package com.design.patterns.memento.test3;

/**
 * @author chenliangsen
 * @date 2020/1/2 11:05
 */
public class Client {
    public static void main(String[] args) {
        FlowAMock mock = new FlowAMock("testFlow");
        mock.runPhaseOne();

        FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
        FlowAMockMemento memento = mock.createMemento();
        careTaker.saveMemento(memento);

        mock.schema1();
        mock.setMemento(careTaker.retirveMemento());
        mock.schema2();
    }
}
