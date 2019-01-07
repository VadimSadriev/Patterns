package Composite;

import Observable.Observable;
import abstracts.Observer;
import abstracts.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();


    Observable observable;

    public Flock(){
        observable = new Observable(this);
    }

    public void registerObserver(Observer observer){
       // observable.registerObserver(observer);
        for (int i = 0; i < quackers.size(); i++){
            var duck = (Quackable)quackers.get(i);
                duck.registerObserver(observer);
        }
    }

    public void notifyObservers(){
        observable.notifyObservers();
    }


    public void add(Quackable quacker){
        quackers.add(quacker);

    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();

        while (iterator.hasNext()){
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
            observable.notifyObservers();
        }
    }
}
