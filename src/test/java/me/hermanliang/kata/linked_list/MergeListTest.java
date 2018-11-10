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

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode cursor1 = l1;
        for (int n : nums1) {
            cursor1.next = new ListNode(n);
            cursor1 = cursor1.next;
        }
        l1 = l1.next;
        ListNode cursor2 = l2;
        for (int n : nums2) {
            cursor2.next = new ListNode(n);
            cursor2 = cursor2.next;
        }
        l2 = l2.next;
        ListNode output = new MergeList().mergeTwoLists(l1, l2);
        for (int num : expected) {
            assertNotNull(output);
            assertEquals(num, output.val);
            output = output.next;
        }
        assertNull(output);
    }
}