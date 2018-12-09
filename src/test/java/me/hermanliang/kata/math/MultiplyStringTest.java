package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyStringTest {

    @Test
    public void multiply1() {
        String num1 = "2";
        String num2 = "3";
        String expected = "6";
        assertEquals(expected, new MultiplyString().multiply(num1, num2));
    }

    @Test
    public void multiply2() {
        String num1 = "123";
        String num2 = "456";
        String expected = "56088";
        assertEquals(expected, new MultiplyString().multiply(num1, num2));
    }
}