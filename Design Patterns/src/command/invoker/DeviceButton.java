package com.command.demo.invoker;

import com.command.demo.commands.Command;

public class DeviceButton {
    
    private Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    public void press() {
        command.excute();
    }

    public void pressUndo() {
        command.undo();
    }
    
}
