package org.example;

public interface ObserverSubject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(ObserverData observerData);
}
