package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTIteratorTest {

    @Test
    public void integrationTest() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        BSTIterator iterator = new BSTIterator(root);
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next());
        assertFalse(iterator.hasNext());
    }
}