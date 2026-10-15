package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleInterestTest {

    SimpleInterest si = new SimpleInterest();

    @Test
    public void testStandardCalculation() {
        assertEquals(200.0, si.calculate(1000, 5, 2), 0.001);
    }

    @Test
    public void testDecimalValues() {
        assertEquals(52.5, si.calculate(1500, 3.5, 1), 0.001);
    }

    @Test
    public void testZeroPrincipal() {
        assertEquals(0.0, si.calculate(0, 5, 2), 0.001);
    }

    @Test
    public void testZeroTime() {
        assertEquals(0.0, si.calculate(2000, 7, 0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativePrincipal() {
        si.calculate(-1000, 5, 2);
    }
}