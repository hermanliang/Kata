package me.hermanliang.kata.util;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode(int val) {
    this.val = val;
  }

  public static TreeNode arrayToTreeNode(Integer[] array) {
    Queue<TreeNode> queue = new LinkedList<>();
    int i = 0;
    TreeNode head = new TreeNode(array[i++]);
    queue.offer(head);
    while (!queue.isEmpty()) {
      if (i >= array.length) break;
      int size = queue.size();
      for (int j = 0; j < size; j++) {
        TreeNode node = queue.poll();
        Integer num = array[i++];
        if (num != null) {
          node.left = new TreeNode(num);
          queue.offer(node.left);
        }
        if (i >= array.length) break;
        num = array[i++];
        if (num != null) {
          node.right = new TreeNode(num);
          queue.offer(node.right);
        }
        if (i >= array.length) break;
      }
    }
    return head;
  }
}
