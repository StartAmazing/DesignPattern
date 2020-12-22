package com.ll.designpattern.porxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TimeMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method,
                            Object[] objects,
                            MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object res = null;
        res = methodProxy.invokeSuper(o, objects);
        System.out.println("after");

        return res;
    }
}
