package commands;

import interfaces.ICommand;
import main.Light;

public class LightOffCommand implements ICommand {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public  void undo(){
        light.off();
    }
}
