package main;

import Enums.Commands;
import interfaces.ICommand;

import java.util.HashMap;

public class RemoteControl {
  private   HashMap<Commands, ICommand> onCommands;
  private HashMap<Commands, ICommand> offCommands;
  private ICommand undoCommand;

    public  RemoteControl(){
        onCommands = new  HashMap<>();
        offCommands = new HashMap<>();
    }

    public void setOnCommand(Commands commandName, ICommand command){
        onCommands.put(commandName,command);
    }
    public void setOffCommand(Commands commandName, ICommand command){
        offCommands.put(commandName,command);
    }

    public void onButtonWasPushed(Commands commandName){
        if (onCommands.containsKey(commandName)){
            onCommands.get(commandName).execute();
            undoCommand = onCommands.get(commandName);
        }
        else {
            System.out.println("Such command does not exists");
        }
    }

    public void offButtonWasPushed(Commands commandName){
        if (offCommands.containsKey(commandName)){
            offCommands.get(commandName).execute();
            undoCommand =   offCommands.get(commandName);
        }
        else {
            System.out.println("Such command does not exists");
        }
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    @Override
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();

        stringBuff.append("\n ---- Remote Control ------ \n");

        for (var item: onCommands.keySet() ) {
               stringBuff.append("Command name - " + item + " , Command - " + onCommands.get(item).getClass().getName() + "\n");
        }

        for (var item: offCommands.keySet() ) {
            stringBuff.append("Command name - " + item + " , Command - " + offCommands.get(item).getClass().getName() + "\n");
        }

        stringBuff.append("And undoCommand is " + undoCommand.getClass().getName());

        return stringBuff.toString();
    }
}
