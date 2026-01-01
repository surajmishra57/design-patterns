package org.example;

/**
 * Strategy design pattern is behavior pattern that let you define family of algorithm and change there object
 * inter
 *
 */
public class Main {
    public static void main(String[] args) {

        ShippingService shippingService = new ShippingService();
        shippingService.calculate(new Order());
        System.out.println("-----------------------------------------");

        shippingService.setShippingStrategy(new WeightBasedShippingStrategy());
        shippingService.calculate(new Order());
        System.out.println("-----------------------------------------");

        shippingService.setShippingStrategy(new DistanceBasedShippingStrategy());
        shippingService.calculate(new Order());

    }
}