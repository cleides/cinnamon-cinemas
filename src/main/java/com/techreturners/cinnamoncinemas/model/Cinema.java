package com.techreturners.cinnamoncinemas.model;

public class Cinema {

    private boolean[][] seats = new boolean[3][5];

    public String checkAndAllocateSeats(int desiredSeatsCount) {
        return "";
    }
    // Seats must be available before allocation
    public boolean checkSeatsAvailable(int desiredSeatsCount) {
        return false;
    }
    //encapsulated because this method can only be run safely if
    // seatsAvailable has passed
    private String allocateSeats(int desiredSeatsCount) {
        return "";
    }

}
