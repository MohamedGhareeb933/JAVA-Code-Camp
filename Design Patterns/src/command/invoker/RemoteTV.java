package com.command.demo.invoker;

import com.command.demo.elctronics.ElctronicDevice;
import com.command.demo.elctronics.Radio;
import com.command.demo.elctronics.Television;

public class RemoteTV {
    
    public static ElctronicDevice TV() {
        return new Television();
    }

    public static ElctronicDevice Radio() {
        return new Radio();
    }
}
