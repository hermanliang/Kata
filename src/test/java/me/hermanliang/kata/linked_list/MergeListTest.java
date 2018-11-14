package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeListTest {

    @Test
    public void mergeTwoLists() {
        int[] nums1 = {1, 2, 4};
        int[] nums2 = {1, 3, 4};
        int[] expected = {1, 1, 2, 3, 4, 4};

        ListNode l1 = arrayToListNode(nums1);
        ListNode l2 = arrayToListNode(nums2);
        ListNode output = new MergeList().mergeTwoLists(l1, l2);
        for (int num : expected) {
            assertNotNull(output);
            assertEquals(num, output.val);
            output = output.next;
        }
        assertNull(output);
    }

    private ListNode arrayToListNode(int[] nums) {
        ListNode listNode = new ListNode(0);
        ListNode cursor = listNode;
        for (int n : nums) {
            cursor.next = new ListNode(n);
            cursor = cursor.next;
        }
        return listNode.next;
    }
}