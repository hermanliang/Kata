package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;
import org.junit.Test;

import static me.hermanliang.kata.util.ListNode.arrayToListNode;
import static me.hermanliang.kata.util.ListNode.listNodeToArray;
import static org.junit.Assert.assertArrayEquals;

public class MergeListTest {

    @Test
    public void mergeTwoLists() {
        int[] nums1 = {1, 2, 4};
        int[] nums2 = {1, 3, 4};
        int[] expected = {1, 1, 2, 3, 4, 4};

        ListNode l1 = arrayToListNode(nums1);
        ListNode l2 = arrayToListNode(nums2);
        ListNode output = new MergeList().mergeTwoLists(l1, l2);
        assertArrayEquals(expected, listNodeToArray(output));
    }

    @Test
    public void mergeKLists() {
        int[] nums1 = {1, 4, 5};
        int[] nums2 = {1, 3, 4};
        int[] nums3 = {2, 6};
        int[] expected = {1, 1, 2, 3, 4, 4, 5, 6};
        ListNode l1 = arrayToListNode(nums1);
        ListNode l2 = arrayToListNode(nums2);
        ListNode l3 = arrayToListNode(nums3);
        ListNode output = new MergeList().mergeKLists(new ListNode[]{l1, l2, l3});
        assertArrayEquals(expected, listNodeToArray(output));
    }
}