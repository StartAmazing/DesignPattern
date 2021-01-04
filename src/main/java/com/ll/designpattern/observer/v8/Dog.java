package com.ll.designpattern.observer.v8;

public class Dog implements Observer {
    public void wang() {
        System.out.println("wangwangwang ...");
    }

    @Override
    public void actionWakeUp(WakeUpEvent wakeUpEvent) {
        wang();
    }
}
