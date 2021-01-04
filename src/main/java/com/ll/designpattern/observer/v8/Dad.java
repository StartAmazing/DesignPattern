package com.ll.designpattern.observer.v8;

/**
 * 观察者
 */
public class Dad implements Observer {

    public void feed() {
        System.out.println("feed ...");
    }

    @Override
    public void actionWakeUp(WakeUpEvent wakeUpEvent) {
        feed();
    }
}
