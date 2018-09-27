package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring1() {
        int expected = 3;
        String input = "abcabcbb"; // "abc"
        assertEquals(expected, new LongestSubstring().lengthOfLongestSubstring(input));
    }

    @Test
    public void lengthOfLongestSubstring2() {
        int expected = 1;
        String input = "bbbbb"; // "b"
        assertEquals(expected, new LongestSubstring().lengthOfLongestSubstring(input));
    }

    @Test
    public void lengthOfLongestSubstring3() {
        int expected = 3;
        String input = "pwwkew"; // "wke"
        assertEquals(expected, new LongestSubstring().lengthOfLongestSubstring(input));
    }

}