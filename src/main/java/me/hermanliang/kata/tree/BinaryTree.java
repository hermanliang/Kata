package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/">
 * https://leetcode.com/problems/binary-tree-level-order-traversal/description/</a>
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/">
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/</a>
 * @see <a href="https://leetcode.com/problems/same-tree/">
 * https://leetcode.com/problems/same-tree/</a>
 * @see <a href="https://leetcode.com/problems/symmetric-tree/">
 * https://leetcode.com/problems/symmetric-tree/</a>
 */
public class BinaryTree {

    /**
     * 102. Binary Tree Level Order Traversal [Medium]
     * <p>
     * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     * <p>
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     * <p>
     * 3
     * / \
     * 9  20
     * /  \
     * 15   7
     * return its level order traversal as:
     * <p>
     * [
     * [3],
     * [9,20],
     * [15,7]
     * ]
     *
     * @param root a TreeNode
     * @return level order traversal of the TreeNode
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> next = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                list.add(node.val);
                next.add(node.left);
                next.add(node.right);
            }
            if (queue.isEmpty()) {
                if (!list.isEmpty()) {
                    output.add(list);
                    list = new ArrayList<>();
                }
                queue = next;
                next = new LinkedList<>();
            }
        }
        return output;
    }

    /**
     * 236. Lowest Common Ancestor of a Binary Tree [Medium]
     * <p>
     * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
     * <p>
     * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined
     * between two nodes p and q as the lowest node in T that has both p and q as descendants
     * (where we allow a node to be a descendant of itself).”
     * <p>
     * Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
     * <p>
     * Example 1:
     * <p>
     * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
     * Output: 3
     * Explanation: The LCA of of nodes 5 and 1 is 3.
     * Example 2:
     * <p>
     * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
     * Output: 5
     * Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself
     * according to the LCA definition.
     * Note:
     * <p>
     * All of the nodes' values will be unique.
     * p and q are different and both values will exist in the binary tree.
     *
     * @param root a TreeNode
     * @param p    p node in the TreeNode
     * @param q    q node in the TreeNode
     * @return lowest common ancestor in p and q
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null) {
            return right;
        } else if (right == null) {
            return left;
        }
        return root;
    }

    /**
     * 100. Same Tree [Easy]
     * <p>
     * Given two binary trees, write a function to check if they are the same or not.
     * <p>
     * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
     * <p>
     * Example 1:
     * <p>
     * Input:     1         1
     *           / \       / \
     *          2   3     2   3
     *
     *         [1,2,3],   [1,2,3]
     *
     * <p>
     * Output: true
     * Example 2:
     * <p>
     * Input:     1         1
     *           /           \
     *          2             2
     *
     *         [1,2],     [1,null,2]
     *
     * <p>
     * Output: false
     * Example 3:
     * <p>
     * Input:     1         1
     *           / \       / \
     *          2   1     1   2
     *
     *         [1,2,1],   [1,1,2]
     *
     * <p>
     * Output: false
     *
     * @param p a TreeNode
     * @param q a TreeNode
     * @return is same tree
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    /**
     * 101. Symmetric Tree [Easy]
     * <p>
     * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
     * <p>
     * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
     *
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * <p>
     * 3  4 4  3
     * But the following [1,2,2,null,3,null,3] is not:
     *
     *     1
     *    / \
     *   2   2
     *    \   \
     *    3    3
     * <p>
     * Note:
     * Bonus points if you could solve it both recursively and iteratively.
     *
     * @param root a TreeNode
     * @return is symmetric tree
     */
    public boolean isSymmetric(TreeNode root) {
        return false;
    }
}
