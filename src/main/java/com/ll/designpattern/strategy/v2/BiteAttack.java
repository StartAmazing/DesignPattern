package com.ll.designpattern.strategy.v2;

public class BiteAttack implements AttackAble{
    @Override
    public void attack() {
        System.out.println("咬.");
    }
}
