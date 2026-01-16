package org.example.entites;

import org.example.enums.NotificationType;

import java.util.UUID;

public class Notification {
    private final String id;
    private final Recipient recipient;
    private final NotificationType type;
    private final String message;
    private final String subject;

    private Notification(BuilderNotification builder) {
        this.id = UUID.randomUUID().toString();
        this.recipient = builder.recipient;
        this.type = builder.type;
        this.message = builder.message;
        this.subject = builder.subject;
    }

    public String getId() {
        return id;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public NotificationType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public static class BuilderNotification {
        private final Recipient recipient;
        private final NotificationType type;
        private String message;
        private String subject;

        public BuilderNotification(Recipient recipient, NotificationType type) {
            this.recipient = recipient;
            this.type = type;
        }

        public BuilderNotification setMessage(String message) {
            this.message = message;
            return this;
        }

        public BuilderNotification setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Notification build() {
            return new Notification(this);
        }
    }

}
