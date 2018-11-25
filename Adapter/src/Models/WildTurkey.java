package Models;

import Interfaces.ITurkey;

public class WildTurkey implements ITurkey {

    @Override
    public void fly() {
        System.out.println("flying a short distance");
    }

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }
}
