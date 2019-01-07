package StateImpl;

import abstracts.IState;
import main.GumballMachine;

public class NoQuarterState implements IState {
   transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }


    public void insertQuarter(){
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You havemt inserted a quarter");
    }

    @Override
    public void turnCrank() {
    System.out.println("You turned but theres no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
