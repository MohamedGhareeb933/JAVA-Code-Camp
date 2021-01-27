package com.command.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;

import com.command.demo.commands.Command;
import com.command.demo.commands.TurnOffAll;
import com.command.demo.commands.TurnOffTV;
import com.command.demo.commands.TurnOnTV;
import com.command.demo.commands.VolumeDownTV;
import com.command.demo.commands.VolumeUpTV;
import com.command.demo.elctronics.ElctronicDevice;
import com.command.demo.invoker.DeviceButton;
import com.command.demo.invoker.RemoteTV;


public class Main 
{
    public static final Logger logger = Logger.getLogger(Main.class.getName());
    private static Stack<Command> undo;

    public static void main( String[] args )
    {
        ElctronicDevice tv = RemoteTV.TV();
        ElctronicDevice radio = RemoteTV.Radio();
        undo = new Stack<>();

        Press(tv, radio);

        System.out.println("undo:");
        while(!undo.isEmpty()){
            Command c = undo.pop();
            DeviceButton device = new DeviceButton(c);
            device.pressUndo();
        }
            
    }

    private static void Press(ElctronicDevice tv, ElctronicDevice radio) {

        TurnOnTV(tv);

        turnOffTV(tv);

        volumeUpTV(tv);

        volumeDownTV(tv);

        List<ElctronicDevice> elctronicList = new ArrayList<>();

        elctronicList.add(tv);
        elctronicList.add(radio);

        turnOffAll(elctronicList);
    }


    private static void volumeDownTV(ElctronicDevice tv) {
        Command volumeDownTv = new VolumeDownTV(tv);
        DeviceButton device = new DeviceButton(volumeDownTv);

        device.press();
        undo.add(volumeDownTv);
        device.press();
        undo.add(volumeDownTv);
    }

    private static void volumeUpTV(ElctronicDevice tv) {
        Command volumeUpTv = new VolumeUpTV(tv);
        
        DeviceButton device = new DeviceButton(volumeUpTv);
        device.press();
        undo.add(volumeUpTv);
        device.press();
        undo.add(volumeUpTv);       
    }

    private static void turnOffTV(ElctronicDevice tv) {
        Command turnOffTv = new TurnOffTV(tv);

        DeviceButton device = new DeviceButton(turnOffTv);

        device.press();
        undo.add(turnOffTv);
    }

    private static void TurnOnTV(ElctronicDevice tv) {
        Command turnOnTv = new TurnOnTV(tv);

        DeviceButton device = new DeviceButton(turnOnTv);

        device.press();
        undo.add(turnOnTv);
    }

    private static void turnOffAll(List<ElctronicDevice> elctronicList) {

        Command turnOffAll = new TurnOffAll(elctronicList);

        DeviceButton device = new DeviceButton(turnOffAll);

        device.press();
        undo.add(turnOffAll);
    }
}
