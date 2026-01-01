package org.example;

public class ThirdPartyShippingBasedStrategy implements ShippingStrategy {

    @Override
    public double calculate(Order order) {
        System.out.println("this is thirdPartyShippingStrategy");
        return 0;
    }
}
