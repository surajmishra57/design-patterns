package org.example.entities;

import org.example.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Address address;
    private final List<Order> orderHistory = new ArrayList<>();

    public Customer(String name, String phone, Address address) {
//        super(name, phone);
        this.address = address;
    }

    public void addOrderToHistory(Order order) { this.orderHistory.add(order); }

    public Address getAddress() {
        return address;
    }

}
