package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseListTest {

    @Test
    public void reverseList() {
        int[] expected = {5, 4, 3, 2, 1};
        ListNode head = ListNode.arrayToListNode(new int[]{1, 2, 3, 4, 5});
        ListNode output = new ReverseList().reverseList(head);
        assertArrayEquals(expected, ListNode.listNodeToArray(output));
    }
}