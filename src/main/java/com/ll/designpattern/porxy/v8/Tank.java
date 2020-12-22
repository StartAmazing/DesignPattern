package com.ll.designpattern.porxy.v8;

import java.util.Random;

/**
 * 问题： 我想记录坦克的移动时间,但是不能改变原来的代码？ benchmark
 *
 * v4: 使用代理
 * v5: 代理各种类型
 * 问题：如果实现代理的各种组合？需求？Decorator? 装饰器模式
 * v6:代理的时候没有Movable类型 - 越来越像decorator了
 * v7:如果有stop方法需要代理...
 * 如果想让logProxy可以重用，不仅可以代理Tank,还可以代理任何其他可以代理的类型。Object
 * （毕竟是日志记录，时间计算是很多方法都需要的东西），这时该怎么去处理呢？
 * 分离代理行为与代理对象
 * 【*】使用jdk的动态代理
 * v8: 模拟代码与业务逻辑分离  AOP
 *   : 通过反射观察生成的代理对象
 * jdk反射生成代理【必须面向接口】，这个是由Proxy的内部实现决定的
 */
public class Tank implements Movable {
    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void attack() {
        System.out.println("Tank attacking boom boom boom...");
    }
}
