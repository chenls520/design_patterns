package com.design.patterns.mediator.test2;

/**
 * @author chenliangsen
 * @date 2019/12/18 10:08
 */
public abstract class Colleague {
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
