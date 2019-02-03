package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromicSubstringsTest {

    @Test
    public void countSubstrings1() {
        String s = "abc";
        // Three palindromic strings: "a", "b", "c".
        int expected = 3;
        assertEquals(expected, new PalindromicSubstrings().countSubstrings(s));
    }

    @Test
    public void countSubstrings2() {
        String s = "aaa";
        // Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
        int expected = 6;
        assertEquals(expected, new PalindromicSubstrings().countSubstrings(s));
    }
}