package me.hermanliang.kata.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JumpGameTest {

  @Test
  public void canJump1() {
    int[] nums = {2, 3, 1, 1, 4};
    assertTrue(new JumpGame().canJump(nums));
  }

  @Test
  public void canJump2() {
    int[] nums = {3, 2, 1, 0, 4};
    assertFalse(new JumpGame().canJump(nums));
  }
}