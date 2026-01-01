package org.example;

public class ShippingService {
    ShippingStrategy shippingStrategy;

    public ShippingService() {
        this.shippingStrategy = new FlatRateShippingStrategy();
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void calculate(Order order) {
        shippingStrategy.calculate(order);
    }
}
