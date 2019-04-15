package me.hermanliang.kata.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GenerateParenthesesTest {

  @Test
  public void generateParenthesis() {
    List<String> expected = Arrays.asList(
        "((()))",
        "(()())",
        "(())()",
        "()(())",
        "()()()"
    );
    List<String> output = new GenerateParentheses().generateParenthesis(3);
    Set<String> dedup = new HashSet<>(output);
    assertEquals(expected.size(), dedup.size());
    for (String s : dedup) {
      assertTrue(expected.contains(s));
    }
  }
}