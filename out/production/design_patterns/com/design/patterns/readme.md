### 设计模式，参考研磨设计模式
#### simple_factory 简单工厂
* 客户端只需要知道接口定义不需要了解具体实现，具体实现交给简单工厂完成。
#### facade 外观模式
* 组合多个模块的调用
#### adapter 适配器模式
* 新增接口转换已有接口，达到复用的目的。客户端调用新接口，适配器转换为老接口调用
#### singleton 单例模式
* 减少对象的创建，只创建一个对象（全局对象？）。分为饿汉式（类加载创建）和懒汉式（第一次调用时创建）
#### factory_method 工厂方法模式
* 客户端只需要知道接口，具体实现由工厂方法来完成。但工厂方法是一个抽象类，具体实现提供一个抽象方法延迟到子类完成。
```$xslt
public class Client {
    public static void main(String[] args) {
        //创建需要使用的Creator对象
        //ExportDBOperate是工厂方法的具体实现类，通过它来创建所需接口的具体对象
        ExportOperate operate = new ExportDBOperate();
        //调用输出数据的功能方法
        operate.export("测试数据");
    }
}
```
#### abstractfactory 抽象工厂模式
* 抽象工厂的功能是创建一系列相关对象或相互依赖的对象的接口，抽象工厂定义一系列接口，自己负责具体对象的创建