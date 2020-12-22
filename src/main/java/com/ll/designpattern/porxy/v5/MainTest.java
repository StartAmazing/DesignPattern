package com.ll.designpattern.porxy.v5;

public class MainTest {
    public static void main(String[] args) {
        new TankTimeProxy(new Tank()).move();
        new TankLogProxy(new Tank()).move();
    }
}
