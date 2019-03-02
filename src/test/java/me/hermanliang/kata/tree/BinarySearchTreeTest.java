package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void lowestCommonAncestor1() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode expected = root;
        assertEquals(expected, new BinarySearchTree().lowestCommonAncestor(root, p, q));
    }

    @Test
    public void lowestCommonAncestor2() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{6, 2, 8, 0, 4, 7, 9, null, null, 3, 5});
        TreeNode p = root.left;
        TreeNode q = p.right;
        TreeNode expected = p;
        assertEquals(expected, new BinarySearchTree().lowestCommonAncestor(root, p, q));
    }

    @Test
    public void isValidBST1() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{2, 1, 3});
        assertTrue(new BinarySearchTree().isValidBST(root));
    }

    @Test
    public void isValidBST2() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{5, 1, 4, null, null, 3, 6});
        assertFalse(new BinarySearchTree().isValidBST(root));
    }
}