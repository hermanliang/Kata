package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome1() {
        int input = 121;
        assertTrue(new PalindromeNumber().isPalindrome(input));
    }

    @Test
    public void isPalindrome2() {
        int input = -121;
        // From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
        assertFalse(new PalindromeNumber().isPalindrome(input));
    }

    @Test
    public void isPalindrome3() {
        int input = 10;
        // Reads 01 from right to left. Therefore it is not a palindrome.
        assertFalse(new PalindromeNumber().isPalindrome(input));
    }
}