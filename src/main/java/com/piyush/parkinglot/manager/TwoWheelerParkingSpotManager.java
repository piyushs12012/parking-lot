package com.piyush.parkinglot.manager;

import java.util.List;

import com.piyush.parkinglot.Vehicle;
import com.piyush.parkinglot.spot.ParkingSpot;
/**import com.piyush.parkinglot.strategy.ParkingSpotStrategy;*/

public class TwoWheelerParkingSpotManager implements ParkingSpotManager {
        List<ParkingSpot> parkingSpots;


        public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpots) {
            this.parkingSpots = parkingSpots;
        }
        void addParkingSpot(ParkingSpot parkingSpot) {
                parkingSpots.add(parkingSpot);
        }
        void removeParkingSpot(ParkingSpot parkingSpot) {
                parkingSpots.remove(parkingSpot);
        }

       @Override
       public ParkingSpot getParkingSpot(Vehicle vehicle) {
        // TODO Auto-generated method stubfor(ParkingSpot parkingSpot: parkingSpots) {
              for(ParkingSpot parkingSpot: parkingSpots) {  
                if(parkingSpot.isEmpty()) {
                    return parkingSpot;
                }
            }
            return null;
       }

}
