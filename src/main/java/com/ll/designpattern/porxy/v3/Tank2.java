package com.ll.designpattern.porxy.v3;

import java.util.Random;

/**
 * 问题： 我想记录坦克的移动时间,但是不能改变原来的代码？ benchmark
 */
public class Tank2 extends Tank{
    /**
     * 模拟坦克移动了一段时间
     */
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
    }
}
