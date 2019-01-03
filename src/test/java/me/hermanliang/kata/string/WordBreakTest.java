package me.hermanliang.kata.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordBreakTest {

    @Test
    public void wordBreak1() {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        // Return true because "leetcode" can be segmented as "leet code".
        boolean expected = true;
        assertEquals(expected, new WordBreak().wordBreak(s, wordDict));
    }

    @Test
    public void wordBreak2() {
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        // Return true because "applepenapple" can be segmented as "apple pen apple".
        // Note that you are allowed to reuse a dictionary word.
        boolean expected = true;
        assertEquals(expected, new WordBreak().wordBreak(s, wordDict));
    }

    @Test
    public void wordBreak3() {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        boolean expected = false;
        assertEquals(expected, new WordBreak().wordBreak(s, wordDict));
    }
}