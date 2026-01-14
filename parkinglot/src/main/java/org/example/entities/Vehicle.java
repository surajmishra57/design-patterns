package org.example.entities;

import org.example.enums.VehicleSize;

public abstract class Vehicle {
    private final String licenceNumber;
    private final VehicleSize vehicleSize;

    public Vehicle(String licenceNumber, VehicleSize vehicleSize) {
        this.licenceNumber = licenceNumber;
        this.vehicleSize = vehicleSize;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }
}
