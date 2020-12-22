package com.ll.designpattern.porxy.v3;

import java.util.Random;

/**
 * 问题： 我想记录坦克的移动时间,但是不能改变原来的代码？ benchmark
 */
public class Tank implements Movable {
    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
