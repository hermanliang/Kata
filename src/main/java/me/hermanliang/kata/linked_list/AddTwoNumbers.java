package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;

/**
 * @see <a href="https://leetcode.com/problems/add-two-numbers/description/">
 * https://leetcode.com/problems/add-two-numbers/description/</a>
 */
public class AddTwoNumbers {

    /**
     * 2. Add Two Numbers
     * <p>
     * You are given two non-empty linked lists representing two
     * non-negative integers. The digits are stored in reverse order
     * and each of their nodes contain a single digit. Add the two
     * numbers and return it as a linked list.
     * You may assume the two numbers do not contain any leading zero,
     * except the number 0 itself.
     *
     * @param l1 1st number as a linked list
     * @param l2 2nd number as a linked list
     * @return sum of two numbers as a linked list
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ret = new ListNode(0);
        ListNode cursor = ret;
        int tens = 0;
        while (l1 != null || l2 != null) {
            int sum = tens;
            cursor.next = new ListNode(0);
            cursor = cursor.next;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            tens = sum / 10;
            cursor.val = sum % 10;
        }
        return ret.next;
    }
}
