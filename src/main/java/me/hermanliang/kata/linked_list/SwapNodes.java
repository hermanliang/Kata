package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/swap-nodes-in-pairs/description/">
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/</a>
 * @see <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/description/">
 * https://leetcode.com/problems/reverse-nodes-in-k-group/description/</a>
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

    /**
     * 25. Reverse Nodes in k-Group [Hard]
     * <p>
     * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
     * <p>
     * k is a positive integer and is less than or equal to the length of the linked list.
     * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
     * <p>
     * Example:
     * <p>
     * Given this linked list: 1->2->3->4->5
     * <p>
     * For k = 2, you should return: 2->1->4->3->5
     * <p>
     * For k = 3, you should return: 3->2->1->4->5
     * <p>
     * Note:
     * <p>
     * Only constant extra memory is allowed.
     * You may not alter the values in the list's nodes, only nodes itself may be changed.
     *
     * @param head a list
     * @param k    reverse k nodes
     * @return result
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode h = dummy;
        ListNode cursor = head;
        ListNode tn;
        while (cursor != null) {
            if (!hasValidGroup(cursor, k)) break;
            ListNode next = move(cursor, k);
            tn = reverse(cursor, k);
            h.next = tn;
            h = move(tn, k - 1);
            h.next = next;
            cursor = h.next;
        }
        return dummy.next;
    }

    private ListNode move(ListNode tn, int m) {
        for (int i = 0; i < m; i++) {
            tn = tn.next;
        }
        return tn;
    }

    private ListNode reverse(ListNode cursor, int k) {
        ListNode prev = cursor;
        cursor = cursor.next;
        prev.next = null;
        while (--k > 0) {
            ListNode tn = cursor;
            cursor = cursor.next;
            tn.next = prev;
            prev = tn;
        }
        return prev;
    }

    private boolean hasValidGroup(ListNode node, int k) {
        ListNode cursor = node;
        while (k > 0 && cursor != null) {
            cursor = cursor.next;
            k--;
        }
        return k == 0;
    }
}
