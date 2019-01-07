package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/binary-search-tree-iterator/description/">
 * https://leetcode.com/problems/binary-search-tree-iterator/description/</a>
 */
public class BSTIterator {

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

    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return false;
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return 0;
    }
}
