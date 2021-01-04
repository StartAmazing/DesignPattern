package com.ll.designpattern.observer.v5;

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
        observers.forEach(Observer::actionWakeUp);
    }
}
