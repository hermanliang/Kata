package me.hermanliang.kata.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToWordsTest {

  @Test
  public void numberToWords1() {
    int num = 123;
    String expected = "One Hundred Twenty Three";
    assertEquals(expected, new NumberToWords().numberToWords(num));
  }

  @Test
  public void numberToWords2() {
    int num = 12345;
    String expected = "Twelve Thousand Three Hundred Forty Five";
    assertEquals(expected, new NumberToWords().numberToWords(num));
  }

  @Test
  public void numberToWords3() {
    int num = 1234567;
    String expected = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven";
    assertEquals(expected, new NumberToWords().numberToWords(num));
  }

  @Test
  public void numberToWords4() {
    int num = 1234567891;
    String expected =
        "One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One";
    assertEquals(expected, new NumberToWords().numberToWords(num));
  }
}