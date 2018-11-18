package me.hermanliang.kata.util;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode arrayToListNode(int[] nums) {
        ListNode listNode = new ListNode(0);
        ListNode cursor = listNode;
        for (int n : nums) {
            cursor.next = new ListNode(n);
            cursor = cursor.next;
        }
        return listNode.next;
    }
}
