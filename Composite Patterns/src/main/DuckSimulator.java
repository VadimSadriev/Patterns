package main;

import Composite.Flock;
import Decorators.QuackCounter;
import Factories.AbstractDuckFactory;
import Factories.CountingDuckFactory;
import Observable.Quackologist;
import abstracts.Observer;
import abstracts.Quackable;
import adapters.GooseAdapter;
import models.*;

public class DuckSimulator {

    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory factory){
        Quackable mallardDuck = factory.createMallardDuck();
        Quackable redheadDuck = factory.createRedheadDuck();
        Quackable duckCall = factory.createDuckCall();
        Quackable rubberDuck = factory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulutor: With Composite - Flocks");

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = factory.createMallardDuck();
        Quackable mallardTwo = factory.createMallardDuck();
        Quackable mallardThree = factory.createMallardDuck();
        Quackable mallardFour = factory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDUck simulator: WIthObserver");
        Observer quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        System.out.println("\nDuck Simulutor: Whole Flock Simulator");

        simulate(flockOfDucks);

        System.out.println("\nDuck Simulutor: Mallard FLock Simulation");
        simulate(flockOfMallards);

        System.out.println("The dyck quacked " + QuackCounter.getQuacks() + " times");
    }
    public void simulate(Quackable duck){
        duck.quack();
    }
}
