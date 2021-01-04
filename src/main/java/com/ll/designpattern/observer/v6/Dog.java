package com.ll.designpattern.observer.v6;

public class Dog implements Observer {
    public void wang() {
        System.out.println("wangwangwang ...");
    }

    @Override
    public void actionWakeUp(WakeUpEvent wakeUpEvent) {
        wang();
    }
}
