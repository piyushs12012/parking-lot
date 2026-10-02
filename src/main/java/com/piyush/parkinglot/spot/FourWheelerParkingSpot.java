package com.piyush.parkinglot.spot;

import com.piyush.parkinglot.Vehicle;

public class FourWheelerParkingSpot implements ParkingSpot {
    Vehicle vehicle=null;

    @Override
    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void removeVehicle() {
        this.vehicle = null;
    }

    @Override
    public boolean isEmpty() {
       if(vehicle == null){
           return true;
       }
       return false;
    }

    @Override
    public int price() {
        return 100;
    }

}
