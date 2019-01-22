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
        return null;
    }
}
