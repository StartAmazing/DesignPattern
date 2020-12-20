package com.ll.designpattern.strategy.v1;

public class ZombieTest {

    public static void main(String[] args) {
        AbstractZombie normalZombie = new NormalZombie();
        AbstractZombie flagZombie = new FlagZombie();

        normalZombie.display();
        normalZombie.attack();
        normalZombie.move();
        System.out.println("========================");
        flagZombie.display();
        flagZombie.attack();
        flagZombie.move();
    }

}
