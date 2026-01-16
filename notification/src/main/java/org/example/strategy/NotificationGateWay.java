package org.example.strategy;

import org.example.entites.Notification;

public interface NotificationGateWay {
    public void send(Notification notification);
}
