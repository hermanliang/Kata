package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerTest {

    @Test
    public void myAtoi1() {
        String input = "42";
        int expected = 42;
        assertEquals(expected, new StringToInteger().myAtoi(input));
    }

    @Test
    public void myAtoi2() {
        // The first non-whitespace character is '-', which is the minus sign.
        // Then take as many numerical digits as possible, which gets 42.
        String input = "   -42";
        int expected = -42;
        assertEquals(expected, new StringToInteger().myAtoi(input));
    }

    @Test
    public void myAtoi3() {
        // Conversion stops at digit '3' as the next character is not a numerical digit.
        String input = "4193 with words";
        int expected = 4193;
        assertEquals(expected, new StringToInteger().myAtoi(input));
    }

    @Test
    public void myAtoi4() {
        // The first non-whitespace character is 'w', which is not a numerical
        // digit or a +/- sign. Therefore no valid conversion could be performed.
        String input = "words and 987";
        int expected = 0;
        assertEquals(expected, new StringToInteger().myAtoi(input));
    }

    @Test
    public void myAtoi5() {
        // The number "-91283472332" is out of the range of a 32-bit signed integer.
        // Thefore INT_MIN (−2^31) is returned.
        String input = "-91283472332";
        int expected = -2147483648;
        assertEquals(expected, new StringToInteger().myAtoi(input));
    }
}