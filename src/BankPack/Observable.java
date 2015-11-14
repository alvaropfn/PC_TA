package BankPack;

import java.util.ArrayList;

/**
 * Created by Alvaro on 14/11/2015.
 */
public abstract class Observable
{
    private ArrayList<Observer> observers;

    protected Observable()
    {
        this.observers = new ArrayList<Observer>();
    }

    public void notifyObservers()
    {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }

    public void addObserver(Observer observer)
    {
        this.observers.add(observer);
    }

    public void delObserver(Observer observer)
    {
        this.observers.remove(observer);
    }

}
