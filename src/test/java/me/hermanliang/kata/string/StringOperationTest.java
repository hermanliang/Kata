package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOperationTest {

    @Test
    public void strStr1() {
        String haystack = "hello";
        String needle = "ll";
        int expected = 2;
        assertEquals(expected, new StringOperation().strStr(haystack, needle));
    }

    @Test
    public void strStr2() {
        String haystack = "aaaaa";
        String needle = "bba";
        int expected = -1;
        assertEquals(expected, new StringOperation().strStr(haystack, needle));
    }

    @Test
    public void strStr3() {
        String haystack = "hello";
        String needle = "";
        int expected = 0;
        assertEquals(expected, new StringOperation().strStr(haystack, needle));
    }
}