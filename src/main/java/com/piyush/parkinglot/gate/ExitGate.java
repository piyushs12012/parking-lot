package com.piyush.parkinglot.gate;

import com.piyush.parkinglot.Ticket;
import com.piyush.parkinglot.spot.ParkingSpot;

public class ExitGate {


   public void clearParkingSpot(Ticket ticket){
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.removeVehicle();
   }



}
