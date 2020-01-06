package com.design.patterns.decorator.test2;

/**
 * 装饰器的具体实现对象
 * @author chenliangsen
 * @date 2020/1/6 14:14
 */
public class ConcreteDecoratorB extends Decorator {


    /**
     * 构造方法，传入组件对象
     *
     * @param component 组件对象
     */
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    /**
     * 需要添加的职责
     */
    private void addedBehavior() {
        //需要添加的职责实现
    }

    @Override
    public void operation() {
        //调用父类的方法，可以在调用前后执行一些附加动作
        super.operation();
        addedBehavior();
    }
}
