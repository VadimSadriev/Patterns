package Models;

import Interfaces.IDuck;

public class MallardDuck implements IDuck {

    @Override
    public void fly() {
        System.out.println("Mallard dck is flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
