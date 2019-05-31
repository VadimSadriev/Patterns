package StateImpl;

import abstracts.IState;
import main.GumballMachine;

public class SoldOutState implements IState {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
