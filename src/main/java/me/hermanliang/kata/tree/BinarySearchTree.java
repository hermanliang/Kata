package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/">
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/</a>
 * @see <a href="https://leetcode.com/problems/validate-binary-search-tree/">
 * https://leetcode.com/problems/validate-binary-search-tree/</a>
 */
public class BinarySearchTree {

    /**
     * 235. Lowest Common Ancestor of a Binary Search Tree [Easy]
     * <p>
     * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
     * <p>
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between
     * two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node
     * to be a descendant of itself).”
     * <p>
     * Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
     * <p>
     * Example 1:
     * <p>
     * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
     * Output: 6
     * Explanation: The LCA of nodes 2 and 8 is 6.
     * Example 2:
     * <p>
     * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
     * Output: 2
     * Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself
     * according to the LCA definition.
     * Note:
     * <p>
     * All of the nodes' values will be unique.
     * p and q are different and both values will exist in the BST.
     *
     * @param root a TreeNode
     * @param p    p node in the TreeNode
     * @param q    q node in the TreeNode
     * @return lowest common ancestor in p and q
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        if (p.val > root.val) {
            if (q.val < root.val) return root;
            return lowestCommonAncestor(root.right, p, q);
        } else {
            if (q.val > root.val) return root;
            return lowestCommonAncestor(root.left, p, q);
        }
    }

    /**
     * 98. Validate Binary Search Tree [Medium]
     *
     * Given a binary tree, determine if it is a valid binary search tree (BST).
     *
     * Assume a BST is defined as follows:
     *
     * The left subtree of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     * Example 1:
     *
     * Input:
     *     2
     *    / \
     *   1   3
     * Output: true
     * Example 2:
     *
     *     5
     *    / \
     *   1   4
     *      / \
     *     3   6
     * Output: false
     * Explanation: The input is: [5,1,4,null,null,3,6]. The root node's value
     *              is 5 but its right child's value is 4.
     * @param root a TreeNode
     * @return is the TreeNode a valid BST
     */
    public boolean isValidBST(TreeNode root) {
        return false;
    }
}
