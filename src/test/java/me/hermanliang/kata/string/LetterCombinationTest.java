package me.hermanliang.kata.string;

import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LetterCombinationTest {

  @Test
  public void letterCombinations() {
    String[] expected = {
        "ad",
        "ae",
        "af",
        "bd",
        "be",
        "bf",
        "cd",
        "ce",
        "cf"
    };
    List<String> output = new LetterCombination().letterCombinations("23");
    assertEquals(expected.length, output.size());
    for (String s : expected) {
      assertTrue(output.contains(s));
    }
  }
}