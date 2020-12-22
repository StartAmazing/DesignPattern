package com.ll.designpattern.porxy.v7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MainTest {
    public static void main(String[] args) {
        Tank tank = new Tank();

        // reflection 通过二进制字节码来分析类的属性和方法
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("method " + method.getName() + " start ...");
                Object o = method.invoke(tank, args);
                System.out.println("method " + method.getName() + " end!");
                return o;
            }
        });

        m.move();
        System.out.println("=======================");
        m.attack();
    }
}
