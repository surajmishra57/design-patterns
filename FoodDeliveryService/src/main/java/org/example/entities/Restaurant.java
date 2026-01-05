package org.example.entities;

import java.util.UUID;

public class Restaurant {
    private final String id;
    private final String name;
    private final Address address;
    private final Menu menu;

    public Restaurant(Address address, String name) {
        this.id = UUID.randomUUID().toString();
        this.address = address;
        this.name = name;
        this.menu = new Menu();
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Menu getMenu() {
        return menu;
    }
}
