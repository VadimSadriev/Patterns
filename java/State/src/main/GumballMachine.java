package main;

import StateImpl.HasQuarterState;
import StateImpl.NoQuarterState;
import StateImpl.SoldOutState;
import StateImpl.SoldState;
import abstracts.GumballMachineRemote;
import abstracts.IState;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
    String location;

    IState soldOutState;
    IState noQuarterState;
    IState hasQuarterState;
    IState soldState;
    IState winnerState;
    IState state = soldOutState;
    int count = 0;//count of gumballs


    public GumballMachine(String location,int numberGumballs) throws RemoteException {
        this.location = location;
        this.count = numberGumballs;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        if (count > 0){
            state = noQuarterState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
       state.ejectQuarter();
    }

    public void turnCrank(){
       state.turnCrank();
       state.dispense();
    }

    public void setState(IState state){
        this.state = state;
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");

        if (count != 0){
            count = count - 1;
        }
    }

    public IState getHasQuarterState(){
        return hasQuarterState;
    }

    public IState getNoQuarterState(){
        return noQuarterState;
    }
    public IState getSoldState(){
        return soldState;
    }
    public  IState getSoldOutState(){
        return soldOutState;
    }
    public IState getState(){
        return state;
    }

    public String getLocation(){
        return location;
    }

    public IState getWinnerState(){
        return winnerState;
    }
    public int getCount(){
        return count;
    }
}
