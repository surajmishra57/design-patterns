package org.example;

public class SmartRingDevice implements Observer{
    @Override
    public void update(ObserverData observerData) {
        System.out.println("SmartRingDevice Data : " + observerData.data + "  price : " + observerData.price);

    }
}
