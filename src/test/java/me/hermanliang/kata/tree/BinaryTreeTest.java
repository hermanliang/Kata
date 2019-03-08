package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BinaryTreeTest {

    @Test
    public void levelOrder() {
        Integer[] nums = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeNode.arrayToTreeNode(nums);
        int[][] expected = {
                {3},
                {9, 20},
                {15, 7}
        };
        List<List<Integer>> output = new BinaryTree().levelOrder(root);
        for (int i = 0; i < output.size(); i++) {
            for (int j = 0; j < output.get(i).size(); j++) {
                assertEquals(expected[i][j], (int) output.get(i).get(j));
            }
        }
    }

    @Test
    public void lowestCommonAncestor1() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode expected = root;
        assertEquals(expected, new BinaryTree().lowestCommonAncestor(root, p, q));
    }

    @Test
    public void lowestCommonAncestor2() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        TreeNode p = root.left;
        TreeNode q = p.right.right;
        TreeNode expected = p;
        assertEquals(expected, new BinaryTree().lowestCommonAncestor(root, p, q));
    }

    @Test
    public void isSameTree1() {
        TreeNode p = TreeNode.arrayToTreeNode(new Integer[]{1, 2, 3});
        TreeNode q = TreeNode.arrayToTreeNode(new Integer[]{1, 2, 3});
        boolean expected = true;
        assertEquals(expected, new BinaryTree().isSameTree(p, q));
    }

    @Test
    public void isSameTree2() {
        TreeNode p = TreeNode.arrayToTreeNode(new Integer[]{1, 2});
        TreeNode q = TreeNode.arrayToTreeNode(new Integer[]{1, null, 2});
        boolean expected = false;
        assertEquals(expected, new BinaryTree().isSameTree(p, q));
    }

    @Test
    public void isSameTree3() {
        TreeNode p = TreeNode.arrayToTreeNode(new Integer[]{1, 2, 1});
        TreeNode q = TreeNode.arrayToTreeNode(new Integer[]{1, 1, 2});
        boolean expected = false;
        assertEquals(expected, new BinaryTree().isSameTree(p, q));
    }

    @Test
    public void isSymmetric1() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        boolean expected = true;
        assertEquals(expected, new BinaryTree().isSymmetric(root));
    }

    @Test
    public void isSymmetric2() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{1, 2, 2, null, 3, null, 3});
        boolean expected = false;
        assertEquals(expected, new BinaryTree().isSymmetric(root));
    }
}