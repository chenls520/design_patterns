### 设计模式，参考研磨设计模式
#### [simple_factory 简单工厂](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/simple_factory)
* 客户端只需要知道接口定义不需要了解具体实现，具体实现交给简单工厂完成。
#### [facade 外观模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/facade)
* 组合多个模块的调用
#### [adapter 适配器模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/adapter)
* 新增接口转换已有接口，达到复用的目的。客户端调用新接口，适配器转换为老接口调用
#### [singleton 单例模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/singleton)
* 减少对象的创建，只创建一个对象（全局对象？）。分为饿汉式（类加载创建）和懒汉式（第一次调用时创建）
#### [factory_method 工厂方法模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/factory_method)
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
#### [abstractfactory 抽象工厂模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/abstractfactory)
* 抽象工厂的功能是创建一系列相关对象或相互依赖的对象的接口，抽象工厂定义一系列接口，自己负责具体对象的创建

#### [builder 生成器模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/builder)
* 生成器模式是对需要的对象根据需要一步一步创建，客户端可以通过builder灵活控制对象属性，也可以使用direct使用builder来构造对象

#### [prototype 原型模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/prototype)
* 原型模式根据克隆一个对象来提高对象复制的效率（由于java中clone不需要new操作，效率更高）。也可以自己定义一个接口通过new一个对象然后挨个属性赋值来实现原型模式。
* clone分为浅clone和深clone。
* 浅clone只复制基本类型（值传递），对象引用类型复制的对象的引用。
* 深clone可以复制对象的值，但需要自己手动操作。这是一个递归的过程，有对象就需要手动clone。

#### [mediator 中介者模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/mediator)
* 中介者模式实现多模块之间解耦，模块之间的交互全部通过中介者对象来实现
* 模块通过中介者来调用其他模块的方法，模块只依赖中介者，不依赖其他模块。中介者依赖所有模块

#### [proxy 代理模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/proxy)
* 静态代理，通过组合的方式持有被代理对象。代理对象跟被代理对象实现相同的接口，代理对象在实现的接口中增强被代理对象功能，再调用被代理对象的方法。
* JDK动态代理，Java自带动态代理类Proxy，通过实现InvocationHandler接口，实现
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    动态生成的字节码如下[具体介绍](https://blog.csdn.net/jiankunking/article/details/52143504)
```$xslt
public final class XXX extends Proxy implements XXX

public final String SayHello(String paramString)
  {
    try
    {
      return (String)this.h.invoke(this, m4, new Object[] { paramString });
    }
    catch (Error|RuntimeException localError)
    {
      throw localError;
    }
    catch (Throwable localThrowable)
    {
      throw new UndeclaredThrowableException(localThrowable);
    }
    
      private static Method m1;
      private static Method m3;
      private static Method m4;
      private static Method m2;
      private static Method m0;
      
      
      
static
  {
    try
    {
      m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] { Class.forName("java.lang.Object") });
      m3 = Class.forName("jiankunking.Subject").getMethod("SayGoodBye", new Class[0]);
      m4 = Class.forName("jiankunking.Subject").getMethod("SayHello", new Class[] { Class.forName("java.lang.String") });
      m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
      m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new NoSuchMethodError(localNoSuchMethodException.getMessage());
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
    }
  }
```
* cglib动态代理
```$xslt
package proxy;
 
import java.lang.reflect.Method;
 
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
 
public class CglibProxy implements MethodInterceptor
{
    // 根据一个类型产生代理类，此方法不要求一定放在MethodInterceptor中
    public Object CreatProxyedObj(Class<?> clazz)
    {
        Enhancer enhancer = new Enhancer();
        
        enhancer.setSuperclass(clazz);
        
        enhancer.setCallback(this);
        
        return enhancer.create();
    }
    
    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable
    {
        // 这里增强
        System.out.println("收钱");
        
        return arg3.invokeSuper(arg0, arg2);
    } 
}
```

#### [observer 观察者模式（注册订阅模式）](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/observer)
* 观察者向被观察者（目标对象）注册自己，被观察者（目标对象）持有观察者接口。
* 被观察者发现改变以后，调用观察者注册的接口对象（回调机制）来通知观察者对象
* 观察者和被观察者属于多对多的方式，开发中避免陷入死循环。
* 被观察者可以根据不同的情况选择回调不同观察者接口（策略模式？）

#### [command 命令模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/command)
* 将客户端和具体实现解耦，客户端只发出命令，不用管命令具体的实现

#### [iterator 迭代器模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/iterator)
* 提供访问一个聚合对象的内容，又不暴露它的内部实现
* Java中的Iterator

#### [composite 组合模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/composite)
* 将部分-整体抽象为一个对象，客户端不需要跟具体的部分或者整体对象交互，只跟抽象交互
* 客户端处理集合中的抽象对

#### [template_method 模板方法模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/template_method)
* 模板方法模式把公用部分封装在父类中，子类实现部分在父类中使用抽象方法的模式让子类强制实现
* 客户端调用具体的算法由具体的子类来决定
* 缺点：耦合性大（继承属于强耦合）

#### [strategy 策略模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/strategy)
* 策略模式使用里式替换原则，具体实现由子类实现。客户端使用时选择不同实现
* 策略模式可以通过反射机制替换掉if else判断（spring IOC中不需要使用反射，直接从容器中获取即可）

#### [state 状态模式](https://github.com/chenls520/design_patterns/tree/master/src/com/design/patterns/state)
* 状态模式，分离对象的行为和状态。根据状态不同，子类实现不同。客户端通过状态定义的接口来选择不同的子类实现
* 状态模式和策略模式相似，区别在于使用场景不同。
* 状态模式针对对象的状态不同选择不同的行为，策略模式针对对象行为不同选择不同的算法
* 状态模式不能互相替换（不同级？），策略模式可以互相替换（同级？）