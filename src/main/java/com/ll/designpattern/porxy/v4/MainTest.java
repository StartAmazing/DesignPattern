package com.ll.designpattern.porxy.v4;

import com.ll.designpattern.porxy.v3.Tank2;

public class MainTest {
    public static void main(String[] args) {
        new TankTimeProxy(new Tank()).move();
    }
}
