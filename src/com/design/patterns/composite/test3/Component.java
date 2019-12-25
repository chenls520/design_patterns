package com.design.patterns.composite.test3;

/**
 * 抽象的组件对象
 * @author chenliangsen
 * @date 2019/12/25 9:58
 */
public abstract class Component {
    /**
     * 输出组件自身的名称
     * @param preStr
     */
    public abstract void printStruct(String preStr);

    /**
     * 向组合对象中加入组件对象
     * @param child 被加入组合对象中的组件对象
     */
    public void addChild(Component child) {
        //缺省的实现，抛出异常，因为叶子节点没有这个功能
        //或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    /**
     * 向组合对象中移除组件对象
     * @param child 被移除组合对象中的组件对象
     */
    public void removeChild(Component child) {
        //缺省的实现，抛出异常，因为叶子节点没有这个功能
        //或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }


    /**
     * 返回某个索引对应的组件对象
     * @param index 需要获取的组件对象的索引，索引从0开始
     * @return 索引对应的组件对象
     */
    public Component getChild(int index) {
        //缺省的实现，抛出异常，因为叶子节点没有这个功能
        //或者子组件没有实现这个功能
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
