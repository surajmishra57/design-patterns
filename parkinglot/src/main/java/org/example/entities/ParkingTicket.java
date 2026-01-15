package org.example.entities;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket {
    private final String parkingId;
    private final long entryTime;
    private long exitTime;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;

    public ParkingTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.parkingId = UUID.randomUUID().toString();
        this.entryTime = new Date().getTime();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public String getParkingId() {
        return parkingId;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public long getExitTime() {
        return exitTime;
    }

    public void setExitTime() {
        this.exitTime = new Date().getTime();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}


