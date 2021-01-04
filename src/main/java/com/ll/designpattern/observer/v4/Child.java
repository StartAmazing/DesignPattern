package com.ll.designpattern.observer.v4;

public class Child {
    private boolean isCry;
    private Dad dad = new Dad();
    private Mum mum = new Mum();
    private Dog dog = new Dog();

    public boolean isCry() {
        return isCry;
    }

    public void wakeUp() {
        isCry = true;
        dad.feed();
        mum.hug();
        dog.wang();
    }
}
