package com.ll.designpattern.porxy.v6;

public class MainTest {
    public static void main(String[] args) {
        new TankTimeProxy(new TankLogProxy(new Tank())).move();
        System.out.println("=================================");
        new TankLogProxy(new TankTimeProxy(new Tank())).move();
    }
}
