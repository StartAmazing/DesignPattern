package com.ll.designpattern.strategy.v1;

public abstract class AbstractZombie {

    public abstract void display();

    public void attack() {
        System.out.println("咬.");
    }

    public void move() {
        System.out.println("一步一步移动。");
    }
}
