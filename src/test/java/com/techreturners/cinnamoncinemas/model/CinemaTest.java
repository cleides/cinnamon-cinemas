package com.techreturners.cinnamoncinemas.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CinemaTest {

    @Test
    void testCheckAndAllocateSeats() {
    }

    @Test
    void testCheckSeatsAvailable() {
        //Arrange
        Cinema sut = new Cinema();
        //Act
        boolean areSeatsAvailable = sut.checkSeatsAvailable(3);
        //Assert
        assertTrue(areSeatsAvailable);
    }


}