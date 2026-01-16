package org.example.strategy;

import org.example.entites.Notification;

public class EmailGateWay implements NotificationGateWay {
    @Override
    public void send(Notification notification) {
        String email = notification.getRecipient().getEmail()
                .orElseThrow(() -> new IllegalArgumentException("email id is required for this operation"));
        System.out.println("--------Email--------");
        System.out.println("To : " + email);
        System.out.println("Subject : " + notification.getSubject());
        System.out.println("Message : " + notification.getMessage());
        System.out.println("---------------------------");
    }
}
