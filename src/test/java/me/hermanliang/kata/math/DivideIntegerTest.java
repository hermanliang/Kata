package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideIntegerTest {

    @Test
    public void divide1() {
        int dividend = 10;
        int divisor = 3;
        int expected = 3;
        assertEquals(expected, new DivideInteger().divide(dividend, divisor));
    }

    @Test
    public void divide2() {
        int dividend = 7;
        int divisor = -3;
        int expected = -2;
        assertEquals(expected, new DivideInteger().divide(dividend, divisor));
    }
}