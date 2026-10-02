package com.piyush.parkinglot;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import com.piyush.parkinglot.gate.EntryGate;
import com.piyush.parkinglot.gate.ExitGate;
import com.piyush.parkinglot.factory.ParkingSpotFactory;
import com.piyush.parkinglot.manager.ParkingSpotManager;
import com.piyush.parkinglot.spot.ParkingSpot;
import com.piyush.parkinglot.spot.FourWheelerParkingSpot;
import com.piyush.parkinglot.spot.TwoWheelerParkingSpot;

public class ParkingLot {
    static Logger logger = Logger.getLogger(ParkingLot.class.getName());
    private final Map<VehicleType, List<ParkingSpot>> parkingSpotsByVehicleType =
            new EnumMap<>(VehicleType.class);
    private final ParkingSpotFactory parkingSpotFactory = new ParkingSpotFactory();

    public ParkingLot() {
        parkingSpotsByVehicleType.put(VehicleType.TWO_WHEELER, new ArrayList<>());
        parkingSpotsByVehicleType.put(VehicleType.FOUR_WHEELER, new ArrayList<>());
    }

    public void addParkingSpot(VehicleType vehicleType, ParkingSpot parkingSpot) {
        parkingSpotsByVehicleType.get(vehicleType).add(parkingSpot);
    }

    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType) {
        return parkingSpotFactory.getParkingSpotManager(
                vehicleType,
                parkingSpotsByVehicleType.get(vehicleType));
    }

    public static void main(String[] args) {
        logger.info("Parking lot system started");
        ParkingLot parkingLot = new ParkingLot();
        Vehicle vehicle = new Vehicle(VehicleType.TWO_WHEELER, 123456);
        parkingLot.addParkingSpot(VehicleType.TWO_WHEELER, new TwoWheelerParkingSpot());
        parkingLot.addParkingSpot(VehicleType.FOUR_WHEELER, new FourWheelerParkingSpot());

        ParkingSpotManager parkingSpotManager = parkingLot.getParkingSpotManager(vehicle.vehicleType);
        EntryGate entryGate = new EntryGate();
        Ticket ticket = entryGate.parkVehicle(vehicle, parkingSpotManager);
        ExitGate exitGate = new ExitGate();
        exitGate.clearParkingSpot(ticket);
    }
}
