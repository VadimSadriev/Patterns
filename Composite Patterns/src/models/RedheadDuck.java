package models;

import Observable.Observable;
import abstracts.Observer;
import abstracts.Quackable;

public class RedheadDuck implements Quackable {
    Observable observable;

    public RedheadDuck(){
        observable = new Observable(this);

    }

    public void registerObserver(Observer observer){
        observable.registerObserver(observer);
    }

    public void notifyObservers(){
        observable.notifyObservers();
    }
    public void quack(){
        System.out.println("Quack");
        notifyObservers();
    }
}
