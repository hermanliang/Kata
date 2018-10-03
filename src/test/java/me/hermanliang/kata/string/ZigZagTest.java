package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZigZagTest {

    /**
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     */
    @Test
    public void convert1() {
        String input = "PAYPALISHIRING";
        int rows = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, new ZigZag().convert(input, rows));
    }

    /**
     * P     I    N
     * A   L S  I G
     * Y A   H R
     * P     I
     */
    @Test
    public void convert2() {
        String input = "PAYPALISHIRING";
        int rows = 4;
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, new ZigZag().convert(input, rows));
    }
}