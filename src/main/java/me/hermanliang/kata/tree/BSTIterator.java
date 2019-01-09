package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;

import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/binary-search-tree-iterator/description/">
 * https://leetcode.com/problems/binary-search-tree-iterator/description/</a>
 */
public class BSTIterator {

    private TreeNode visit;
    private Stack<TreeNode> stack;

    /**
     * 173. Binary Search Tree Iterator [Medium]
     * <p>
     * mplement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
     * <p>
     * Calling next() will return the next smallest number in the BST.
     * <p>
     * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, where h is the height of the tree.
     * <p>
     * Credits:
     * Special thanks to @ts for adding this problem and creating all test cases.
     *
     * @param root a TreeNode
     */
    public BSTIterator(TreeNode root) {
        this.visit = root;
        this.stack = new Stack<>();
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return visit != null || !stack.isEmpty();
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        while (visit != null) {
            stack.push(visit);
            visit = visit.left;
        }
        TreeNode next = stack.pop();
        visit = next.right;
        return next.val;
    }
}
