package main;

import Enums.Commands;
import commands.*;
import interfaces.ICommand;

/*Encapsulates request like an object allowing parametrize client objects with other requests
* queuing or registration of requests also canceling requests*/
public class CommandProgram {

    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();

        LightOnCommand lightOn = new LightOnCommand(new Light());
        LightOffCommand lightOff = new LightOffCommand(new Light());


        OrderFoodCommand foodOrder = new OrderFoodCommand(new Food());

        StereoOnWithCDCommand stereoWithCDOn = new StereoOnWithCDCommand(new Stereo());
        StereoOffWithCDCommand stereoWithCDOff = new StereoOffWithCDCommand(new Stereo());

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(new CeilingFan("Living room"));

        ICommand[] onPartyCommands = new ICommand[]{
                lightOn,
                foodOrder,
                stereoWithCDOn,
                ceilingFanHigh
        };

        ICommand[] offPartyCommands = new ICommand[]{
                lightOff,
                stereoWithCDOff
        };

        MacroCommand partyOnMacro = new MacroCommand(onPartyCommands);
        MacroCommand partyOffMacro = new MacroCommand(offPartyCommands);


        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(foodOrder);
        remote.buttonWasPressed();


        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setOnCommand(Commands.LightOn, lightOn);
        remoteControl.setOffCommand(Commands.LightOff, lightOff);
        remoteControl.onButtonWasPushed(Commands.LightOn);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(Commands.LightOff);

        remoteControl.setOnCommand(Commands.StereoOn, stereoWithCDOn);
        remoteControl.setOffCommand(Commands.StereoOff, stereoWithCDOff);
        remoteControl.onButtonWasPushed(Commands.StereoOn);
        remoteControl.offButtonWasPushed(Commands.StereoOff);
        remoteControl.undoButtonWasPushed();

        remoteControl.setOnCommand(Commands.CeilingFanHigh, ceilingFanHigh);
        remoteControl.onButtonWasPushed(Commands.CeilingFanHigh);

        System.out.println("\n\n\n\n");

        remoteControl.setOnCommand(Commands.MacroOnCommands, partyOnMacro);
        remoteControl.setOffCommand(Commands.MacroOffCommands, partyOffMacro);

        remoteControl.onButtonWasPushed(Commands.MacroOnCommands);
        /*remoteControl.offButtonWasPushed(Commands.MacroOffCommands);*/

        System.out.println(remoteControl);
    }
}
