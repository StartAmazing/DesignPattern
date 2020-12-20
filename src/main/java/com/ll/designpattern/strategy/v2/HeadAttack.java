package com.ll.designpattern.strategy.v2;

public class HeadAttack implements AttackAble {
    @Override
    public void attack() {
        System.out.println("撞");
    }
}
