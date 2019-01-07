package StateImpl;

import abstracts.IState;
import main.GumballMachine;

public class SoldState implements IState {
    GumballMachine gumballMachine;

    public SoldState( GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry you already turned the crank");
    }

    @Override
    public void insertQuarter() {
    System.out.println("Please wait wer are already giving you a gumball");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesnt get you another gumball");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
        else {
            System.out.println("Oops out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }
}
