package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.ListNode;
import me.hermanliang.kata.util.TreeNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

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

    @Test
    public void zigzagLevelOrder() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> result = new BinaryTree().zigzagLevelOrder(root);
        assertEquals(3, result.size());
        assertArrayEquals(new int[]{3}, listToArray(result.get(0)));
        assertArrayEquals(new int[]{20, 9}, listToArray(result.get(1)));
        assertArrayEquals(new int[]{15, 7}, listToArray(result.get(2)));
    }

    private int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    @Test
    public void buildTree() {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode expected = TreeNode.arrayToTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7});
        TreeNode result = new BinaryTree().buildTree(preorder, inorder);
        assertTrue(new BinaryTree().isSameTree(expected, result));
    }

    @Test
    public void sortedListToBST() {
        ListNode head = ListNode.arrayToListNode(new int[]{-10, -3, 0, 5, 9});
        TreeNode expected = TreeNode.arrayToTreeNode(new Integer[]{0, -10, 5, null, -3, null, 9});
        TreeNode result = new BinaryTree().sortedListToBST(head);
        assertTrue(new BinaryTree().isSameTree(expected, result));
    }

    @Test
    public void isBalanced1() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertTrue(new BinaryTree().isBalanced(root));
    }

    @Test
    public void isBalanced2() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{1, 2, 2, 3, 3, null, null, 4, 4});
        assertFalse(new BinaryTree().isBalanced(root));
    }

    @Test
    public void minDepth() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7});
        int expected = 2;
        assertEquals(expected, new BinaryTree().minDepth(root));
    }

    @Test
    public void pathSum() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        int sum = 22;
        List<List<Integer>> result = new BinaryTree().pathSum(root, sum);
        List<Integer> expect1 = Arrays.asList(5, 4, 11, 2);
        List<Integer> expect2 = Arrays.asList(5, 8, 4, 5);
        assertEquals(2, result.size());
        for (List<Integer> integers : result) {
            if (integers.equals(expect1)) {
                expect1 = null;
            } else if (integers.equals(expect2)) {
                expect2 = null;
            }
        }
        assertNull(expect1);
        assertNull(expect2);
    }

    @Test
    public void flatten() {
        TreeNode root = TreeNode.arrayToTreeNode(new Integer[]{1, 2, 5, 3, 4, null, 6});
        new BinaryTree().flatten(root);
        int i = 1;
        assertNotNull(root);
        while (root != null) {
            assertEquals(i++, root.val);
            root = root.right;
        }
    }
}