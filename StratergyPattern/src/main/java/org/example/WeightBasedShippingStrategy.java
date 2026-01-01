package org.example;

public class WeightBasedShippingStrategy implements ShippingStrategy {
    @Override
    public double calculate(Order order) {
        System.out.println("this is weightBasedShipping strategy");
        return 0;
    }
}
