package com.command.demo.commands;

import com.command.demo.elctronics.ElctronicDevice;

public class VolumeDownTV implements Command {

    private ElctronicDevice elctronicDevice;

    public VolumeDownTV(ElctronicDevice elctronicDevice) {
        this.elctronicDevice = elctronicDevice;
    }

    @Override
    public void excute() {
        elctronicDevice.volumeDown();
    }

    @Override
    public void undo() {
        elctronicDevice.volumeUp();
    }
    
}
