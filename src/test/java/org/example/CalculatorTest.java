package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    public void testAddTwoNumbers() {
        assertEquals(3, Calculator.add(1, 2));
        assertEquals(-2, Calculator.add(-1, -1));
    }

    @Test
    public void testAddMultipleNumbers() {
        assertEquals(15, Calculator.add(1, 2, 3, 4, 5));
        assertEquals(3, Calculator.add(1, 2));
        assertEquals(-2, Calculator.add(-1, -1));
    }

    @Test
    public void testMultiplyTwoNumbers() {
        assertEquals(3, Calculator.multiply(1, 3));
        assertEquals(-3, Calculator.multiply(-1, 3));
    }

    @Test
    public void testMultiplyMultipleNumbers() {
        assertEquals(120, Calculator.multiply(1, 2, 3, 4, 5));
        assertEquals(3, Calculator.multiply(1, 3));
        assertEquals(-3, Calculator.multiply(-1, 3));
    }
}