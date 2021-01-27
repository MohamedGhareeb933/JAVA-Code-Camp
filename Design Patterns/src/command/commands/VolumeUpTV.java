package com.command.demo.commands;

import com.command.demo.elctronics.ElctronicDevice;

public class VolumeUpTV implements Command {

    private ElctronicDevice elctronicDevice;

    public VolumeUpTV(ElctronicDevice elctronicDevice) {
        this.elctronicDevice = elctronicDevice;
    }

    @Override
    public void excute() {
        elctronicDevice.volumeUp();
    }

    @Override
    public void undo() {
        elctronicDevice.volumeDown();
    }
}
