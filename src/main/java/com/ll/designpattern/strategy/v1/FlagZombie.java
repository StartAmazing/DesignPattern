package com.ll.designpattern.strategy.v1;

public class FlagZombie extends AbstractZombie{
    @Override
    public void display() {
        System.out.println("我是旗手僵尸。");
    }
}
