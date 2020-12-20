package com.ll.designpattern.strategy.v1;

public class BigHeadZombie extends AbstractZombie{
    @Override
    public void display() {
        System.out.println("我是大头僵尸.");
    }

    @Override
    public void attack() {
        // ... 游戏特效
        System.out.println("头撞.");
    }
}
