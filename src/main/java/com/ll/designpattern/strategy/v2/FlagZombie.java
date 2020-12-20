package com.ll.designpattern.strategy.v2;

public class FlagZombie extends Zombie{

    public FlagZombie() {
        super(new StepByStepMove(), new HeadAttack());
    }

    public FlagZombie(MoveAble moveAble, AttackAble attackAble) {
        super(moveAble, attackAble);
    }

    @Override
    public void display() {
        System.out.println("我是旗手僵尸.");
    }

    @Override
    void move() {
        moveAble.move();
    }

    @Override
    void attack() {
        attackAble.attack();
    }
}
