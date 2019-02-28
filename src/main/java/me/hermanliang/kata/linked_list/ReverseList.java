package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/reverse-linked-list/description/">
 * https://leetcode.com/problems/reverse-linked-list/description/</a>
 * @see <a href="https://leetcode.com/problems/reverse-linked-list-ii/">
 * https://leetcode.com/problems/reverse-linked-list-ii/</a>
 */
public class ReverseList {

    /**
     * 206. Reverse Linked List [Easy]
     * <p>
     * Reverse a singly linked list.
     * <p>
     * Example:
     * <p>
     * Input: 1->2->3->4->5->NULL
     * Output: 5->4->3->2->1->NULL
     * Follow up:
     * <p>
     * A linked list can be reversed either iteratively or recursively. Could you implement both?
     *
     * @param head a ListNode
     * @return reversed ListNode
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode next = head.next;
        head.next = null;
        while (next != null) {
            ListNode tmp = next.next;
            next.next = head;
            head = next;
            next = tmp;
        }
        return head;
    }

    /**
     * 92. Reverse Linked List II [Medium]
     * <p>
     * Reverse a linked list from position m to n. Do it in one-pass.
     * <p>
     * Note: 1 ≤ m ≤ n ≤ length of list.
     * <p>
     * Example:
     * <p>
     * Input: 1->2->3->4->5->NULL, m = 2, n = 4
     * Output: 1->4->3->2->5->NULL
     *
     * @param head a ListNode
     * @param m    m
     * @param n    n
     * @return reverse ListNode from position m to n
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        return null;
    }
}
