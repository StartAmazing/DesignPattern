package com.ll.designpattern.strategy.v2;

public class StepByStepMove implements MoveAble{
    @Override
    public void move() {
        System.out.println("一步一步移动.");
    }
}
