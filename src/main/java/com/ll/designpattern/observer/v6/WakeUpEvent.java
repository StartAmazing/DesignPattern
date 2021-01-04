package com.ll.designpattern.observer.v6;

public class WakeUpEvent {
    private long timestamp;
    private String location;

    public WakeUpEvent(long timestamp, String location) {
        this.timestamp = timestamp;
        this.location = location;
    }
}
