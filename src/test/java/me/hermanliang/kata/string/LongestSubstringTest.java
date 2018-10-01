package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void longestPalindrome1() {
        String expected1 = "bab";
        String expected2 = "aba";
        String input = "babad";
        String output = new LongestSubstring().longestPalindrome(input);
        assertTrue(output.equals(expected1) || output.equals(expected2));
    }

    @Test
    public void longestPalindrome2() {
        String expected = "bb";
        String input = "cbbd";
        String output = new LongestSubstring().longestPalindrome(input);
        assertEquals(expected, output);
    }
}