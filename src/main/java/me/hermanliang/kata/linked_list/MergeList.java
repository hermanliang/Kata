package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/description/">
 * https://leetcode.com/problems/merge-two-sorted-lists/description/</a>
 */
public class MergeList {

    /**
     * 21. Merge Two Sorted Lists [Easy]
     * <p>
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the first two lists.
     * <p>
     * Example:
     * <p>
     * Input: 1->2->4, 1->3->4
     * <p>
     * Output: 1->1->2->3->4->4
     *
     * @param l1 list 1
     * @param l2 list 2
     * @return merged list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cursor = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                cursor.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                cursor.next = new ListNode(l1.val);
                l1 = l1.next;
            }
            cursor = cursor.next;
        }
        while (l1 != null) {
            cursor.next = new ListNode(l1.val);
            cursor = cursor.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            cursor.next = new ListNode(l2.val);
            cursor = cursor.next;
            l2 = l2.next;
        }
        return dummy.next;
    }
}
