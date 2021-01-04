package com.ll.designpattern.observer.v8;

public class WakeUpEvent extends AbstractEvent<Child> {
    private long timestamp;
    private String location;
    private Child source;

    public WakeUpEvent(long timestamp, String location, Child source) {
        this.timestamp = timestamp;
        this.location = location;
        this.source = source;
    }

    @Override
    Child getSource() {
        return this.source;
    }
}
