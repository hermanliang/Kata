package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SwapNodesTest {

    @Test
    public void swapPairs() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {2, 1, 4, 3};
        ListNode input = ListNode.arrayToListNode(nums);
        ListNode output = new SwapNodes().swapPairs(input);
        assertArrayEquals(expected, ListNode.listNodeToArray(output));
    }

    @Test
    public void reverseKGroup() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {3, 2, 1, 4, 5};
        int k = 3;
        ListNode head = ListNode.arrayToListNode(nums);
        ListNode output = new SwapNodes().reverseKGroup(head, k);
        assertArrayEquals(expected, ListNode.listNodeToArray(output));
    }
}