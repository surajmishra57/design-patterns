package org.example;

public class WatchDevice implements Observer{
    @Override
    public void update(ObserverData observerData) {
        System.out.println("Watch Device Data : " + observerData.data + "  price : " + observerData.price);
    }
}
