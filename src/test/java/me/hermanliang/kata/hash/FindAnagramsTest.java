package me.hermanliang.kata.hash;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindAnagramsTest {

  @Test
  public void findAnagrams() {
    String s = "cbaebabacd";
    String p = "abc";
    List<Integer> expected = Arrays.asList(0, 6);
    assertEquals(expected, new FindAnagrams().findAnagrams(s, p));
  }
}