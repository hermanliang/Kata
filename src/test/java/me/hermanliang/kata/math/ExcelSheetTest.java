package me.hermanliang.kata.math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExcelSheetTest {

  @Test
  public void convertToTitle1() {
    int n = 1;
    String expected = "A";
    assertEquals(expected, new ExcelSheet().convertToTitle(n));
  }

  @Test
  public void convertToTitle2() {
    int n = 28;
    String expected = "AB";
    assertEquals(expected, new ExcelSheet().convertToTitle(n));
  }

  @Test
  public void convertToTitle3() {
    int n = 701;
    String expected = "ZY";
    assertEquals(expected, new ExcelSheet().convertToTitle(n));
  }
}