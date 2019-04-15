package me.hermanliang.kata.linked_list;

import java.util.ArrayList;
import java.util.List;
import me.hermanliang.kata.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/">
 * https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/</a>
 */
public class RemoveNode {

  /**
   * 19. Remove Nth Node From End of List [Medium]
   * <p>
   * Given a linked list, remove the n-th node from the end of list and return its head.
   * <p>
   * Example: Given linked list: 1->2->3->4->5, and n = 2. After removing the second node from the
   * end, the linked list becomes 1->2->3->5.
   * <p>
   * Note: Given n will always be valid.
   * <p>
   * Follow up: Could you do this in one pass?
   *
   * @param head a linked list
   * @param n n-th node from the end of list
   * @return the linked list which n-th node is removed
   */
  public ListNode removeNthFromEnd(ListNode head, int n) {
    int len = 0;
    List<ListNode> nodes = new ArrayList<>();
    ListNode cursor = head;
    while (cursor != null) {
      nodes.add(cursor);
      len++;
      cursor = cursor.next;
    }
    int start = len - n - 1;
    if (start < 0) {
      head = head.next;
    } else {
      nodes.get(start).next = (n == 1) ? null : nodes.get(start + 2);
    }
    return head;
  }
}
