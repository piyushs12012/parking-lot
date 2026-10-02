package com.piyush.parkinglot.factory;

import java.util.List;

import com.piyush.parkinglot.VehicleType;
import com.piyush.parkinglot.manager.FourWheelerParkingSpotManager;
import com.piyush.parkinglot.manager.ParkingSpotManager;
import com.piyush.parkinglot.manager.TwoWheelerParkingSpotManager;
import com.piyush.parkinglot.spot.ParkingSpot;

/**
 * ParkingSpotFactory
 */
public class ParkingSpotFactory {

    public ParkingSpotManager getParkingSpotManager(VehicleType type,List<ParkingSpot> parkingSpots) {
     switch (type) {
        case TWO_WHEELER:
            return new TwoWheelerParkingSpotManager(parkingSpots);
        case FOUR_WHEELER: 
            return new FourWheelerParkingSpotManager(parkingSpots);
        default:
            throw new IllegalArgumentException("Invalid vehicle type: " + type);
     }
    }
}
