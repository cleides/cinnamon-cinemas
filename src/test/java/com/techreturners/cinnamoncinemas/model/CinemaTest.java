package com.techreturners.cinnamoncinemas.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {

    @Test
    void testCheckAndAllocateSeats() {
        //Arrange
        Cinema sut = new Cinema();
        //Act
        String seatReference = sut.checkAndAllocateSeats(3);
        //Assert
        assertEquals("A1 A2 A3", seatReference);
    }

    @Test
    void testCheckSeatsAvailable() {
        boolean areSeatsAvailable = new Cinema().checkSeatsAvailable(3);
        assertTrue(areSeatsAvailable);
    }
    @Test
    void testCheckSeatsNotAvailable() {
        boolean areSeatsAvailable = new Cinema().checkSeatsAvailable(16);
        assertFalse(areSeatsAvailable);
    }

}