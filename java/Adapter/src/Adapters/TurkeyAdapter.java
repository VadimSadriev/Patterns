package Adapters;

import Interfaces.IDuck;
import Interfaces.ITurkey;

public class TurkeyAdapter implements IDuck {

    ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        //turkey cant fly a lot so

        for (int i = 0; i <= 5 ; i++){
            this.turkey.fly();
        }
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }
}
