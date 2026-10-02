package com.piyush.parkinglot.gate;

import com.piyush.parkinglot.Ticket;
import com.piyush.parkinglot.Vehicle;
import com.piyush.parkinglot.manager.ParkingSpotManager;
import com.piyush.parkinglot.spot.ParkingSpot;

public class EntryGate {
    Vehicle vehicle;
    Ticket ticket;
    
     public EntryGate() {
    }

     public Ticket parkVehicle(Vehicle vehicle, ParkingSpotManager parkingSpotManager) {
       this.vehicle = vehicle;
       ParkingSpot parkingSpot = parkingSpotManager.getParkingSpot(vehicle);
       if (parkingSpot == null) {
          throw new IllegalStateException("No parking spot available for " + vehicle.vehicleType);
       }
       parkingSpot.parkVehicle(vehicle);
       ticket = new Ticket(parkingSpot, vehicle);
       return ticket;
     }
       
}
