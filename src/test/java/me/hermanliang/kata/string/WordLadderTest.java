package me.hermanliang.kata.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordLadderTest {

    @Test
    public void ladderLength1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        // As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
        //return its length 5.
        int expected = 5;
        assertEquals(expected, new WordLadder().ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void ladderLength2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        // The endWord "cog" is not in wordList, therefore no possible transformation.
        int expected = 0;
        assertEquals(expected, new WordLadder().ladderLength(beginWord, endWord, wordList));
    }
}