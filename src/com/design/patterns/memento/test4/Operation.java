package com.design.patterns.memento.test4;

/**
 * 算法类，真正实现加减运算
 * @author chenliangsen
 * @date 2020/1/2 13:55
 */
public class Operation implements OperationApi {
    /**
     * 记录运算的结果
     */
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void add(int num) {
        result += num;
    }

    @Override
    public void substract(int num) {
        result -= num;
    }

    @Override
    public Memento createMemento() {
        MementoImpl memento = new MementoImpl(result);
        return memento;
    }

    @Override
    public void setMemento(Memento memento) {
        MementoImpl memento1 = (MementoImpl) memento;
        this.result = memento1.getResult();
    }

    /**
     * 备忘录对象
     */
    private static class MementoImpl implements Memento {
        private int result = 0;

        public MementoImpl(int result) {
            this.result = result;
        }

        public int getResult() {
            return result;
        }
    }

}
