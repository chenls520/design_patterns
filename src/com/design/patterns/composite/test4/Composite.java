package com.design.patterns.composite.test4;



import java.util.ArrayList;
import java.util.List;

/**
 * 组合对象，可以包含其他组合对象或者叶子对象
 * @author chenliangsen
 * @date 2019/12/25 9:26
 */
public class Composite extends Component{
    /**
     * 用来记录包含的其他组合对象
     */
    private List<Component> childComponents = null;

    /**
     * 组合对象的名字
     */
    private String name = "";

    /**
     * 构造方法，传入组合对象的名字
     * @param name 组合对象的名字
     */
    public Composite(String name) {
        this.name = name;
    }



    @Override
    public void printStruct(String preStr) {
        //先输出自己，前序遍历？
        System.out.println(preStr + " - " + this.name);
        if (this.childComponents != null) {
            //然后添加一个空格，表示向后缩进一个空格，输出自己包含的叶子对象
            preStr += " ";
            //输出当前对象的子对象
            for (Component composite : childComponents) {
                //递归输出每个子对象
                composite.printStruct(preStr);
            }
        }

    }

    @Override
    public void addChild(Component child) {
        //延迟初始化
        if (childComponents == null) {
            childComponents = new ArrayList<Component>();
        }
        childComponents.add(child);
        //添加对父组件的引用
        child.setParent(this);
    }

    @Override
    public void removeChild(Component child) {
        if (childComponents != null) {
            int index = childComponents.indexOf(child);
            if (index != -1) {
                //先把被删除的商品类别对象的父商品类别
                //设置成为被删除的商品类别的子类别的父商品类别
                for (Component component : child.getChild()) {
                    //删除的组件对象是本实例的一个子组件对象
                    component.setParent(this);
                    //把被删除的商品类别对象的子组件对象添加到当前实例中
                    childComponents.add(component);
                }
                //真的删除
                childComponents.remove(index);
            }

        }
    }

    @Override
    public Component getChild(int index) {
        if (childComponents != null) {
            if (index>=0 && index<childComponents.size()) {
                return childComponents.get(index);
            }
        }
        return null;
    }

    @Override
    public List<Component> getChild() {
        return childComponents;
    }
}
