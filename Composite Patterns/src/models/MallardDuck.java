package models;

import Observable.Observable;
import abstracts.Observer;
import abstracts.Quackable;

public class MallardDuck implements Quackable {
     Observable observable;

    public void registerObserver(Observer observer){
        observable.registerObserver(observer);
    }

    public void notifyObservers(){
        observable.notifyObservers();
    }

    public MallardDuck(){
        observable = new Observable(this);
    }

    public void quack(){
        System.out.println("Quack");
        notifyObservers();
    }
}
