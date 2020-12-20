package com.ll.designpattern.strategy.v1;

public class NormalZombie extends AbstractZombie{
    @Override
    public void display() {
        System.out.println("我是普通僵尸.");
    }
}
