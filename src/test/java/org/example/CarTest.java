package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car goodCar = new Car("Toyota", "Corolla", "lilac", 2002);

    @Test
    void startCar_returnsNoise_whenCalled() {
        String expected = "Wwwroooommmm!";
        assertEquals(expected, goodCar.startCar());
    }

    @Test
    void accelSpeed_accelerateSpeed_byRateOfTen() {
        int expectedSpeed = 60;
        goodCar.accelSpeed();
        goodCar.accelSpeed();
        goodCar.accelSpeed();
        goodCar.accelSpeed();
        goodCar.accelSpeed();
        goodCar.accelSpeed();
        assertEquals(expectedSpeed, goodCar.getSpeed());
    }
}