package com.ll.designpattern.porxy.v8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
        Tank tank = new Tank();

        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles","true");

        // reflection 通过二进制字节码来分析类的属性和方法
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TimeProxy(tank));


        // 这个m对象已经是代理对象啦，代理对象这个类只会在内存中出现，所以我们感知不到
        m.move();
        System.out.println("=======================");
        m.attack();
    }
}

class TimeProxy implements InvocationHandler {

    Movable m;

    public TimeProxy(Movable m) {
        this.m = m;
    }

    public void before(){
        System.out.println("method start ...");
    }

    public void after(){
        System.out.println("method stop ...");
    }


    // 第一个参数是生成的代理对象
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(m, args);
        after();
        return o;
    }
}
