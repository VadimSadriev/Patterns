package commands;

import interfaces.ICommand;
import main.Stereo;

public class StereoOffWithCDCommand implements ICommand {
    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute(){
        stereo.off();
    }

    @Override
    public  void undo(){
        stereo.on();
    }
}

