package org.example;

public class FlatRateShippingStrategy implements ShippingStrategy {
    @Override
    public double calculate(Order order) {
        System.out.println("this is flat rate strategy");
        return 0;
    }
}
