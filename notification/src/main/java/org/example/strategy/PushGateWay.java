package org.example.strategy;

import org.example.entites.Notification;

public class PushGateWay implements NotificationGateWay {
    @Override
    public void send(Notification notification) {
        String pushToke = notification.getRecipient().getPushToke()
                .orElseThrow(() -> new IllegalArgumentException("Push Token is required for push"));
        System.out.println("-----------Push----------");
        System.out.println("To : " + pushToke);
        System.out.println("Message : " + notification.getMessage());
        System.out.println("-----------------------------------");
    }
}
