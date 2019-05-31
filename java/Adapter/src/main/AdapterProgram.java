package main;

import Adapters.TurkeyAdapter;
import Interfaces.IDuck;
import Models.MallardDuck;
import Models.WildTurkey;

public class AdapterProgram {
    /*The adapter pattern converts the class interface to another interface that the client is designed for.
     The adapter allows classes to work together, which is impossible under normal conditions due to
      the incompatibility of interfaces.*/
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        IDuck turkeyAdapter = new TurkeyAdapter(turkey);
        turkey.fly();
        turkey.gobble();

        testDuck(duck);

        testDuck(turkeyAdapter);
    }

   static void testDuck(IDuck duck){
        duck.fly();
        duck.quack();
    }
}
