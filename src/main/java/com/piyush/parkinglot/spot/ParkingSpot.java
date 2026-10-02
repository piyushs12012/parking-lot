package com.piyush.parkinglot.spot;

import com.piyush.parkinglot.Vehicle;

public interface ParkingSpot {

        boolean isEmpty();
        int price();
        void parkVehicle(Vehicle vehicle);
        void removeVehicle();

}
