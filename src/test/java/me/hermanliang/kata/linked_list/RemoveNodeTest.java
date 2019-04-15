package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class RemoveNodeTest {

  @Test
  public void removeNthFromEnd() {
    int[] nums = {1, 2, 3, 4, 5};
    int[] expected = {1, 2, 3, 5};
    int n = 2;
    ListNode head = new ListNode(nums[0]);
    ListNode cursor = head;
    for (int i = 1; i < nums.length; i++) {
      if (cursor.next == null) {
        cursor.next = new ListNode(nums[i]);
      }
      cursor = cursor.next;
    }
    ListNode output = new RemoveNode().removeNthFromEnd(head, n);
    for (int num : expected) {
      assertNotNull(output);
      assertEquals(num, output.val);
      output = output.next;
    }
    assertNull(output);
  }
}