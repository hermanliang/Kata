package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RemoveDuplicatesTest {

  @Test
  public void deleteDuplicates1() {
    ListNode head = ListNode.arrayToListNode(new int[] {1, 1, 2});
    int[] expected = {1, 2};
    ListNode output = new RemoveDuplicates().deleteDuplicates(head);
    assertArrayEquals(expected, ListNode.listNodeToArray(output));
  }

  @Test
  public void deleteDuplicates2() {
    ListNode head = ListNode.arrayToListNode(new int[] {1, 1, 2, 3, 3});
    int[] expected = {1, 2, 3};
    ListNode output = new RemoveDuplicates().deleteDuplicates(head);
    assertArrayEquals(expected, ListNode.listNodeToArray(output));
  }
}