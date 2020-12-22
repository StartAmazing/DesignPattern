package com.ll.designpattern.porxy.cglib;

import java.util.Random;

public class Tank {
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
