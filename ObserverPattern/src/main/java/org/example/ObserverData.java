package org.example;

import java.util.ArrayList;
import java.util.List;

public class ObserverData implements ObserverSubject {
    public int data;
    public int price;
    private List<Observer> observerList = new ArrayList<>();

    public void publishData(int data, int price) {
        this.data = data;
        this.price = price;
        notifyObservers(this);
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(ObserverData observerData) {
        for (var observer : observerList) {
            observer.update(observerData);
        }
    }
}
