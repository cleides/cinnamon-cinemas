package com.techreturners.cinnamoncinemas.model;

public class Cinema {

    private boolean[][] seats = new boolean[3][5];

    public String checkAndAllocateSeats(int desiredSeatsCount) {
        return "";
    }

    // Seats must be available before allocation
    public boolean checkSeatsAvailable(int desiredSeatsCount) {
        int availableSeatsCount = 0;
        for (int rowIndex = 0; rowIndex < seats.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < seats[rowIndex].length; columnIndex++) {
                boolean isSold = seats[rowIndex][columnIndex]; //reading the status of the seat
                if (!isSold) {
                    availableSeatsCount++;
                }
            }
        }
        if (availableSeatsCount >= desiredSeatsCount)
            return true;
        else
            return false;
    }

    //encapsulated because this method can only be run safely if
    // seatsAvailable has passed
    private String allocateSeats(int desiredSeatsCount) {
        return "";
    }
}
