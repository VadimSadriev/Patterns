package commands;

import interfaces.ICommand;
import main.Stereo;

public class StereoOnWithCDCommand implements ICommand {
    Stereo stereo;

    public  StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }

    @Override
    public  void undo(){
        stereo.off();
    }
}

