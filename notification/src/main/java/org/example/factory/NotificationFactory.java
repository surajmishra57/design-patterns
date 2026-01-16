package org.example.factory;

import org.example.enums.NotificationType;
import org.example.strategy.EmailGateWay;
import org.example.strategy.NotificationGateWay;
import org.example.strategy.PushGateWay;
import org.example.strategy.SmsGateWay;

import java.util.HashMap;
import java.util.Map;

public class NotificationFactory {
    private final static Map<NotificationType, NotificationGateWay> gatewayMap = new HashMap<>();

    public static NotificationGateWay createGateWay(NotificationType type) {
        if (gatewayMap.containsKey(type)) return gatewayMap.get(type);
        NotificationGateWay gateWay = null;
        switch (type) {
            case EMAIL:
                gateWay = new EmailGateWay();
                break;
            case SMS:
                gateWay = new SmsGateWay();
                break;
            case PUSH:
                gateWay = new PushGateWay();
                break;
        }
        gatewayMap.put(type, gateWay);
        return gateWay;

    }
}
