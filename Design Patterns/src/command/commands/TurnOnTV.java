package com.command.demo.commands;

import com.command.demo.elctronics.ElctronicDevice;

public class TurnOnTV implements Command {

    private ElctronicDevice elctronicDevice;

    public TurnOnTV(ElctronicDevice elctronicDevice) {
        this.elctronicDevice = elctronicDevice;
    }

    @Override
    public void excute() {
        elctronicDevice.on();
    }

    @Override
    public void undo() {
        elctronicDevice.off();
    }
    
}
