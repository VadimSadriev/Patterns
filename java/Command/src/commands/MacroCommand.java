package commands;

import interfaces.ICommand;

public class MacroCommand implements ICommand {
    ICommand[] commands;

    public MacroCommand(ICommand[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i<commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i<commands.length; i++){
            commands[i].undo();
        }
    }
}
