package com.design.patterns.interpreter.test1;

/**
 * 抽象表达式
 * @author chenliangsen
 * @date 2020/1/6 9:11
 */
public abstract class AbstractExpression {
    /**
     * 解释的操作
     * @param ctx 上下文对象
     */
    public abstract void interpret(Context ctx);
}
