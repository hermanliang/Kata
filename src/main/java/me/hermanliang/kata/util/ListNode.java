package me.hermanliang.kata.util;


import java.util.ArrayList;
import java.util.List;

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

    public static int[] listNodeToArray(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
