package com.ll.designpattern.strategy.v1;

public class XxxZombie extends BigHeadZombie{
    @Override
    public void move() {
        System.out.println("xxxx");
    }

    // .... 如果接下来的僵尸需要继承这个XxxZombie，那么就会无止尽往下继承....
}
