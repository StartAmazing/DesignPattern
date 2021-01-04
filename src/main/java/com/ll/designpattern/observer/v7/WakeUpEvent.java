package com.ll.designpattern.observer.v7;

public class WakeUpEvent {
    private long timestamp;
    private String location;
    private Child source;

    public WakeUpEvent(long timestamp, String location, Child source) {
        this.timestamp = timestamp;
        this.location = location;
        this.source = source;
    }
}
