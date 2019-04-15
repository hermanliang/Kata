package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeListTest {

  @Test
  public void isPalindrome1() {
    ListNode head = ListNode.arrayToListNode(new int[] {1, 2});
    boolean expected = false;
    assertEquals(expected, new PalindromeList().isPalindrome(head));
  }

  @Test
  public void isPalindrome2() {
    ListNode head = ListNode.arrayToListNode(new int[] {1, 2, 2, 1});
    boolean expected = true;
    assertEquals(expected, new PalindromeList().isPalindrome(head));
  }
}