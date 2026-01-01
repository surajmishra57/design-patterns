package org.example;

public class DistanceBasedShippingStrategy implements ShippingStrategy {
    @Override
    public double calculate(Order order) {
        System.out.println("this is distance based");
        return 0;
    }
}
