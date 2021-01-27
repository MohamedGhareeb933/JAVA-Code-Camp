package com.command.demo.elctronics;

public class Television implements ElctronicDevice {

    private int volume = 0;

    private final String DEVICE_NAME = "TV";

    @Override
    public void on() {
        System.out.println( DEVICE_NAME + " is on");

    }

    @Override
    public void off() {
        System.out.println(DEVICE_NAME + " is off");

    }

    @Override
    public void volumeUp() {
        System.out.println(DEVICE_NAME + " volume is up: " + ++volume);
    }

    @Override
    public void volumeDown() {
        System.out.println(DEVICE_NAME + " volume is down: " + --volume);
    }
    
}
