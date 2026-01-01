package org.example;

public class MobileDevice implements Observer {
    @Override
    public void update(ObserverData observerData) {
        System.out.println("MobileDevice Data : " + observerData.data + "  price : " + observerData.price);

    }
}
