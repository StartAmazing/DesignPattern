package com.ll.designpattern.observer.v7;

import java.util.ArrayList;
import java.util.List;

public class Child {
    private boolean isCry;
    List<Observer> observers = new ArrayList<>();
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return isCry;
    }

    public void wakeUp() {
        isCry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
        observers.forEach(ele -> ele.actionWakeUp(event));
    }
}
