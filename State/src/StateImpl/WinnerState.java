package StateImpl;

import abstracts.IState;
import main.GumballMachine;

public class WinnerState implements IState {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine){
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
        System.out.println("You are a winner! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
            else {
                System.out.println("Oops out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }

    }
}
