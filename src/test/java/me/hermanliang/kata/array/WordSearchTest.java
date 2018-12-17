package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordSearchTest {

    private char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'},
    };

    @Test
    public void exist1() {
        String word = "ABCCED";
        boolean expected = true;
        assertEquals(expected, new WordSearch().exist(board, word));
    }

    @Test
    public void exist2() {
        String word = "SEE";
        boolean expected = true;
        assertEquals(expected, new WordSearch().exist(board, word));
    }

    @Test
    public void exist3() {
        String word = "ABCB";
        boolean expected = false;
        assertEquals(expected, new WordSearch().exist(board, word));
    }
}