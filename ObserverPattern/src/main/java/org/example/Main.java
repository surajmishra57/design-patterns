package org.example;


/**
 * Observer design pattern is behaver design pattern that establish one-to-many relationship between object
 * so when one object (Publisher) change his state other objects (Subscriber) automatically updated
 *
 */
public class Main {
    public static void main(String[] args) {
        Observer mobileDevice = new MobileDevice();
        Observer watchDevice = new WatchDevice();
        Observer smartDevice = new SmartRingDevice();


        ObserverData observerData = new ObserverData();
        observerData.addObserver(mobileDevice);
        observerData.addObserver(watchDevice);
        observerData.addObserver(smartDevice);


        observerData.publishData(100, 120);
        observerData.publishData(110, 110);
        observerData.publishData(120, 130);
        observerData.publishData(130, 140);

    }

}