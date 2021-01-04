package com.ll.designpattern.observer.v5;

/**
 * 观察者
 */
public class Dad implements Observer {

    public void feed() {
        System.out.println("feed ...");
    }

    @Override
    public void actionWakeUp() {
        feed();
    }
}
