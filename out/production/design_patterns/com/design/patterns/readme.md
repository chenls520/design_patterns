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

#### builder 生成器模式
* 生成器模式是对需要的对象根据需要一步一步创建，客户端可以通过builder灵活控制对象属性，也可以使用direct使用builder来构造对象

#### prototype 原型模式
* 原型模式根据克隆一个对象来提高对象复制的效率（由于java中clone不需要new操作，效率更高）。也可以自己定义一个接口通过new一个对象然后挨个属性赋值来实现原型模式。
* clone分为浅clone和深clone。
* 浅clone只复制基本类型（值传递），对象引用类型复制的对象的引用。
* 深clone可以复制对象的值，但需要自己手动操作。这是一个递归的过程，有对象就需要手动clone。

#### mediator 中介者模式
* 中介者模式实现多模块之间解耦，模块之间的交互全部通过中介者对象来实现
* 模块通过中介者来调用其他模块的方法，模块只依赖中介者，不依赖其他模块。中介者依赖所有模块

#### proxy 代理模式
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