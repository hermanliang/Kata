package me.hermanliang.kata.tree;

import me.hermanliang.kata.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/">
 * https://leetcode.com/problems/binary-tree-level-order-traversal/description/</a>
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
}