package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesTest {

    @Test
    public void swapPairs() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {2, 1, 4, 3};
        ListNode input = ListNode.arrayToListNode(nums);
        ListNode output = new SwapNodes().swapPairs(input);
        for (int num : expected) {
            assertNotNull(output);
            assertEquals(num, output.val);
            output = output.next;
        }
        assertNull(output);
    }
}