package com.command.demo.commands;

import com.command.demo.elctronics.ElctronicDevice;

public class TurnOffTV implements Command{

    private ElctronicDevice elctronicDevice;

    public TurnOffTV(ElctronicDevice elctronicDevice) {
        this.elctronicDevice = elctronicDevice;
    }

    @Override
    public void excute() {
        elctronicDevice.off();
    }

    @Override
    public void undo() {
        elctronicDevice.on();
    }

}
