package org.example.decorator;

import org.example.entites.Notification;
import org.example.strategy.NotificationGateWay;

public class RetryableGatewayDecorator implements NotificationGateWay {
    private final NotificationGateWay wrappedGateWay;
    private final int maxRetries;
    private final long retryDelayMillis;

    public RetryableGatewayDecorator(NotificationGateWay wrappedGateWay, int maxRetries, long retryDelayMillis) {
        this.wrappedGateWay = wrappedGateWay;
        this.maxRetries = maxRetries;
        this.retryDelayMillis = retryDelayMillis;
    }

    @Override
    public void send(Notification notification) throws InterruptedException {
        int attempt = 0;
        while (attempt < maxRetries) {
            try {
                wrappedGateWay.send(notification);
                break;
            } catch (Exception e) {
                attempt++;
                System.out.println("Notification Send Is Break We Will Try " + attempt + "in next" + retryDelayMillis + "millis");
                if (attempt >= maxRetries) {
                    System.out.println("Max Retry Attempt Failed");
                    throw new RuntimeException("Failed To send Notification");
                }
                Thread.sleep(retryDelayMillis);
            }
        }
    }
}
