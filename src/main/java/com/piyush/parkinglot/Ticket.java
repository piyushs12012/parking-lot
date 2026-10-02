package com.piyush.parkinglot;

import com.piyush.parkinglot.spot.ParkingSpot;

public class Ticket {
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    public Ticket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    

}
