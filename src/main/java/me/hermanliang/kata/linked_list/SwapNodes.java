package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/description/">
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/</a>
 */
public class SwapNodes {

    /**
     * 24. Swap Nodes in Pairs [Medium]
     * <p>
     * Given a linked list, swap every two adjacent nodes and return its head.
     * <p>
     * Example:
     * <p>
     * Given 1->2->3->4, you should return the list as 2->1->4->3.
     * <p>
     * Note:
     * <p>
     * Your algorithm should use only constant extra space.
     * You may not modify the values in the list's nodes, only nodes itself may be changed.
     *
     * @param head a list
     * @return swap every two adjacent nodes and return its head
     */
    public ListNode swapPairs(ListNode head) {
        ListNode cursor = head;
        int tmp;
        while (cursor != null && cursor.next != null) {
            tmp = cursor.val;
            cursor.val = cursor.next.val;
            cursor.next.val = tmp;
            cursor = cursor.next.next;
        }
        return head;
    }
}
