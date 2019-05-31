package main;

import interfaces.ICommand;

public class SimpleRemoteControl {
    ICommand command;

    public  SimpleRemoteControl(){}

    public  void setCommand(ICommand command){
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
