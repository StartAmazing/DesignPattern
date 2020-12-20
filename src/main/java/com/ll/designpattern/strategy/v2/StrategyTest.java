package com.ll.designpattern.strategy.v2;

public class StrategyTest {

    public static void main(String[] args) {
        Zombie normalZombie = new NormalZombie();
        Zombie flagZombie = new FlagZombie();

        normalZombie.display();
        normalZombie.move();
        normalZombie.attack();

        System.out.println("=========================");

        normalZombie.display();
        normalZombie.move();
        normalZombie.setAttackAble(new HitAttack());
        normalZombie.attack();

        System.out.println("==========================");
        flagZombie.display();
        flagZombie.move();
        flagZombie.attack();
    }
}
