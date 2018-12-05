package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddBinaryTest {

    @Test
    public void addBinary1() {
        String a = "11";
        String b = "1";
        String expected = "100";
        assertEquals(expected, new AddBinary().addBinary(a, b));
    }

    @Test
    public void addBinary2() {
        String a = "1010";
        String b = "1011";
        String expected = "10101";
        assertEquals(expected, new AddBinary().addBinary(a, b));
    }
}