package me.hermanliang.kata.linked_list;

import java.util.Stack;
import me.hermanliang.kata.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/palindrome-linked-list/description/">
 * https://leetcode.com/problems/palindrome-linked-list/description/</a>
 */
public class PalindromeList {

  /**
   * 234. Palindrome Linked List [Easy]
   * <p>
   * Given a singly linked list, determine if it is a palindrome.
   * <p>
   * Example 1:
   * <p>
   * Input: 1->2 Output: false Example 2:
   * <p>
   * Input: 1->2->2->1 Output: true Follow up: Could you do it in O(n) time and O(1) space?
   *
   * @param head a ListNode
   * @return is the ListNode a palindrome
   */
  public boolean isPalindrome(ListNode head) {
    ListNode tmp = head;
    int len = 0;
    while (tmp != null) {
      len++;
      tmp = tmp.next;
    }
    int half = len / 2;
    Stack<Integer> stack = new Stack<>();
    while (half-- > 0) {
      stack.push(head.val);
      head = head.next;
    }
    if (len % 2 == 1) head = head.next;
    while (head != null) {
      if (stack.pop() != head.val) return false;
      head = head.next;
    }
    return true;
  }
}
