package Decorators;

import Observable.Observable;
import abstracts.Observer;
import abstracts.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    Observable observable;

    public void registerObserver(Observer observer){
        //observable.registerObserver(observer);
        duck.registerObserver(observer);
    }

    public void notifyObservers(){
        //observable.notifyObservers();
        duck.notifyObservers();
    }

    public QuackCounter(Quackable duck){
       // observable = new Observable(this);
        this.duck = duck;
    }
    public void quack(){
        duck.quack();
        numberOfQuacks++;
    }
    public static int getQuacks(){
        return numberOfQuacks;
    }
}
