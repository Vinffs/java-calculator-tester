package org.learning.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculate;

    @BeforeAll
      @DisplayName("Calculator initialization")
    static void init() {
        calculate = new Calculator();
    }


    @Test
    @DisplayName("Addition between two floats")
    void add() {
        assertEquals(8.00F, calculate.add(5.00F,3.00F), 0.001);
        assertEquals(-2, calculate.add(-5, 3), 0.001);
        assertEquals(0, calculate.add(0, 0), 0.001);
    }

    @Test
    @DisplayName("Subtraction between two floats")
    void subtract() {
        assertEquals(2, calculate.subtract(5, 3), 0.001);
        assertEquals(-8, calculate.subtract(-5, 3), 0.001);
        assertEquals(0, calculate.subtract(0, 0), 0.001);
    }

    @Test
    @DisplayName("Division between two floats")
    void divide() {
        assertEquals(2, calculate.divide(6, 3), 0.001);
        assertEquals(-2, calculate.divide(-6, 3), 0.001);
        assertEquals(0, calculate.divide(0, 5), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculate.divide(6, 0));
    }

    @Test
    @DisplayName("Multiplication between two floats")
    void multiply() {
        assertEquals(15, calculate.multiply(5, 3), 0.001);
        assertEquals(-15, calculate.multiply(5, -3), 0.001);
        assertEquals(0, calculate.multiply(5, 0), 0.001);
    }
}