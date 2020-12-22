package com.ll.designpattern.porxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * 使用cglib其实是使用的目标类的子类
 * 但是cglib不能生成final类的代理，因为final不能被继承，cglib底层用的也是asm
 *
 * 但是asm都可以
 */
public class MainTest {
    public static void main(String[] args) {

        // 增强器
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(Tank.class);
        enhancer.setCallback(new TimeMethodInterceptor()); // 类比InvocationHandler
        Tank tank = (Tank) enhancer.create();  // 动态代理的生成
        tank.move();
    }
}
