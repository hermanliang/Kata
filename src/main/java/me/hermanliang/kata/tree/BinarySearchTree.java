package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/">
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/</a>
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
}
