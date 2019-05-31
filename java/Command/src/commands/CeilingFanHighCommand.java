package commands;

import interfaces.ICommand;
import main.CeilingFan;

public class CeilingFanHighCommand implements ICommand {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
        prevSpeed = ceilingFan.getSpeed();
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.setHigh();
    }

    @Override
    public void undo() {
        if (prevSpeed == ceilingFan.HIGH){
            ceilingFan.setHigh();
        }else if (prevSpeed == ceilingFan.MEDIUM){
            ceilingFan.setMedium();
        }
        else if (prevSpeed == ceilingFan.LOW){
            ceilingFan.setLow();
        }
        else if (prevSpeed == ceilingFan.OFF){
            ceilingFan.setOff();
        }
    }
}
