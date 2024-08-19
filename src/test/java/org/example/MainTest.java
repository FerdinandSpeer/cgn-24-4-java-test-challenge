package org.example;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test//Annotation
    void add_shouldReturn10_whenCalledWith5And5() {
        assertEquals(10, Main.add(5, 5));
    }

    @Test
    void isEven_shouldReturnTrue_whenNumberIs2() {
        assertTrue(Main.isEven(2));
    }
    @Test
    void product_shouldReturn4_whenCalledWith2And2() {
        assertEquals(4, Main.product(2, 2));
    }
    @Test
    void product_shouldReturnNeg4_whenCalledWith2AndNeg2() {
        assertEquals(-4, Main.product(2, -2));
    }
    @Test
    void toUpperCase_returnsABC_whenABC(){
        assertEquals("ABC", Main.toUpperCase("abc"));
    }
    @Test
    void checkIfPositive_returnsTrue_when2IsPositive(){
        assertTrue(Main.checkIfPositive(2));
    }
}