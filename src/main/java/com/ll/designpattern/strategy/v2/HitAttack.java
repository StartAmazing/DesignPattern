package com.ll.designpattern.strategy.v2;

public class HitAttack implements AttackAble{
    @Override
    public void attack() {
        System.out.println("打");
    }
}
