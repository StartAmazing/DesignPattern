package com.ll.designpattern.observer.v8;

public class Mum implements Observer {
    public void hug() {
        System.out.println("hug ...");
    }

    @Override
    public void actionWakeUp(WakeUpEvent wakeUpEvent) {
        hug();
    }
}
