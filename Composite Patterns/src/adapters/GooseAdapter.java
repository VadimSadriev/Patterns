package adapters;

import Observable.Observable;
import abstracts.Observer;
import abstracts.Quackable;
import models.Goose;

public class GooseAdapter implements Quackable {
    Goose goose;

    Observable observable;

    public void registerObserver(Observer observer){
        observable.registerObserver(observer);
    }

    public void notifyObservers(){
        observable.notifyObservers();
    }


    public GooseAdapter(Goose goose){
        this.goose = goose;
        observable = new Observable(this);

    }
    public void quack(){
        goose.honk();
    }
}
