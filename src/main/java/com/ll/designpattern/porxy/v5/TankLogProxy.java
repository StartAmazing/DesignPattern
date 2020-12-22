package com.ll.designpattern.porxy.v5;

public class TankLogProxy implements Movable {

    // 聚合了一个tank,看上去像一个代理人，我只记录我想要的东西，剩下的用
    // 具体的tank对象处理，注意这里tank和tankProxy需要实现同样的接口
    // 聚合与继承相比，聚合可以继承Movable的其他实现了该对象的程序
    Tank tank;

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        tank.move();
        System.out.println("stopped!");
    }
}
