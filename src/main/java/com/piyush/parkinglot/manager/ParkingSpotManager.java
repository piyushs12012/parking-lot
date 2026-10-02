package com.piyush.parkinglot.manager;

import com.piyush.parkinglot.Vehicle;
import com.piyush.parkinglot.spot.ParkingSpot;

public interface ParkingSpotManager {
         ParkingSpot getParkingSpot(Vehicle vehicle);
}
