package me.hermanliang.kata.other;

import org.junit.Test;

import static org.junit.Assert.*;

public class VersionControlTest {

  @Test
  public void firstBadVersion() {
    int n = 5;
    int expected = 4;
    VersionControl.setBadVersion(expected);
    assertEquals(expected, new VersionControl().firstBadVersion(n));
  }

}