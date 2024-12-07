package org.example.week10;

public class Main {
    public static void main(String[] args) {

        ParkingLot parkingLot=new ParkingLot(5);
        for (int i = 1; i <=10 ; i++) {
            String customer = "Customer "+ i;
            new Thread(() -> parkingLot.enterParking(customer)).start();
        }
    }
}
