package com.command.demo.commands;

import java.util.List;

import com.command.demo.elctronics.ElctronicDevice;

public class TurnOffAll implements Command {

    private List<ElctronicDevice> elctronicList;

    public TurnOffAll(List<ElctronicDevice> elctronicList) {
        this.elctronicList = elctronicList;
    }

    @Override
    public void excute() {
        for(ElctronicDevice index : elctronicList) {
            index.off();
        }
    }

    @Override
    public void undo() {
        for(ElctronicDevice index : elctronicList) {
            index.on();
        }
    }


}
    