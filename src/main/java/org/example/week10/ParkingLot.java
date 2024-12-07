package org.example.week10;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ParkingLot {
/*
Simulate a parking lot with a fixed number of parking spots (e.g., 5).
Use a Semaphore to control access to the parking spots.
Create multiple threads representing cars:
A car thread waits for an available spot, parks for a random amount of time, and then leaves.
Print messages indicating when a car parks and leaves
 */

    private final Semaphore parkingSpots;

    public ParkingLot(int spotCount) {
        this.parkingSpots = new Semaphore(spotCount);
    }

    public void enterParking(String customer) {
        try {
            System.out.println(customer + " entering");
            parkingSpots.acquire();
            System.out.println(customer + " made a parking");
            Thread.sleep(getRandom());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        } finally {
            parkingSpots.release();
            System.out.println(customer + " left the parking");
        }
    }

    public int getRandom(){
        Random random=new Random();
        return random.nextInt(2500);
    }


}
