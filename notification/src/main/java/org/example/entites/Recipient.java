package org.example.entites;

import java.util.Optional;

public class Recipient {
    private final String userId;
    private final Optional<String> email;
    private final Optional<String> pushToke;
    private final Optional<String> phoneNumber;

    public Recipient(String userId, String email, String pushToke, String phoneNumber) {
        this.userId = userId;
        this.email = Optional.ofNullable(email);
        this.pushToke = Optional.of(pushToke);
        this.phoneNumber = Optional.ofNullable(phoneNumber);
    }

    public String getUserId() {
        return userId;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getPushToke() {
        return pushToke;
    }

    public Optional<String> getPhoneNumber() {
        return phoneNumber;
    }
}
