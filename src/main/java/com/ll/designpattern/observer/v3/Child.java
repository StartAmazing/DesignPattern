package com.ll.designpattern.observer.v3;

public class Child {
    private boolean isCry;
    private Dad dad = new Dad();

    public boolean isCry() {
        return isCry;
    }

    public void wakeUp() {
        isCry = true;
        dad.feed();
    }
}
