package com.techreturners.cinnamoncinemas.model;

public class Cinema {

    private boolean[][] seats = new boolean[3][5];

    public String checkAndAllocateSeats(int desiredSeatsCount) {
        if (checkSeatsAvailable(desiredSeatsCount)) {
            return allocateSeats(desiredSeatsCount);
        } else
            return "NOT_AVAILABLE";
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
        String seatReferences = "";
        int foundSeatCount = 0;
        outerloop:
        for (int rowIndex = 0; rowIndex < seats.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < seats[rowIndex].length; columnIndex++) {
                boolean isSold = seats[rowIndex][columnIndex]; //reading the status of the seat
                if (!isSold) {
                    seats[rowIndex][columnIndex] = true;
                    String seatRef = getSeatRef(rowIndex, columnIndex);
                    seatReferences += seatRef;
                    foundSeatCount++;
                    if (foundSeatCount >= desiredSeatsCount) {
                        break outerloop;
                    }
                }
            }
        }
        return seatReferences;
    }

    private String getSeatRef(int rowIndex, int columnIndex) {
        columnIndex++;
        if (rowIndex == 0) {
            return "A" + columnIndex;
        } else if (rowIndex == 1) {
            return "B" + columnIndex;
        } else {
            return "C" + columnIndex;
        }
    }
}
