package me.hermanliang.kata.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import me.hermanliang.kata.util.ListNode;
import me.hermanliang.kata.util.TreeNode;

/**
 * @see <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/">
 * https://leetcode.com/problems/binary-tree-level-order-traversal/description/</a>
 * @see <a href="https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/">
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/</a>
 * @see <a href="https://leetcode.com/problems/same-tree/">
 * https://leetcode.com/problems/same-tree/</a>
 * @see <a href="https://leetcode.com/problems/symmetric-tree/">
 * https://leetcode.com/problems/symmetric-tree/</a>
 * @see <a href="https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/">
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/</a>
 * @see <a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/">
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/</a>
 * @see <a href="https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/">
 * https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/</a>
 * @see <a href="https://leetcode.com/problems/balanced-binary-tree/">
 * https://leetcode.com/problems/balanced-binary-tree/</a>
 * @see <a href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/</a>
 * @see <a href="https://leetcode.com/problems/path-sum-ii/">
 * https://leetcode.com/problems/path-sum-ii/</a>
 * @see <a href="https://leetcode.com/problems/flatten-binary-tree-to-linked-list/">
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/</a>
 * @see <a href="https://leetcode.com/problems/binary-tree-vertical-order-traversal/">
 * https://leetcode.com/problems/binary-tree-vertical-order-traversal/</a>
 * @see <a href="https://leetcode.com/problems/diameter-of-binary-tree/">
 * https://leetcode.com/problems/diameter-of-binary-tree/</a>
 * @see <a href="https://leetcode.com/problems/validate-binary-search-tree/">
 * https://leetcode.com/problems/validate-binary-search-tree/</a>
 */
public class BinaryTree {

  private TreeNode prev = null;
  private Map<TreeNode, Integer> diameterCache;

  public BinaryTree() {
    diameterCache = new HashMap<>();
  }

  /**
   * 102. Binary Tree Level Order Traversal [Medium]
   * <p>
   * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to
   * right, level by level).
   * <p>
   * For example: Given binary tree [3,9,20,null,null,15,7],
   * <p>
   * 3 / \ 9  20 /  \ 15   7 return its level order traversal as:
   * <p>
   * [ [3], [9,20], [15,7] ]
   *
   * @param root a TreeNode
   * @return level order traversal of the TreeNode
   */
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
      List<Integer> list = new ArrayList<>();
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        list.add(node.val);
        if (node.left != null) {
          queue.offer(node.left);
        }
        if (node.right != null) {
          queue.offer(node.right);
        }
      }
      result.add(list);
    }
    return result;
  }

  /**
   * 236. Lowest Common Ancestor of a Binary Tree [Medium]
   * <p>
   * Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
   * <p>
   * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between
   * two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow
   * a node to be a descendant of itself).”
   * <p>
   * Given the following binary tree:  root = [3,5,1,6,2,0,8,null,null,7,4]
   * <p>
   * Example 1:
   * <p>
   * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 Output: 3 Explanation: The LCA of of
   * nodes 5 and 1 is 3. Example 2:
   * <p>
   * Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4 Output: 5 Explanation: The LCA of
   * nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition.
   * Note:
   * <p>
   * All of the nodes' values will be unique. p and q are different and both values will exist in
   * the binary tree.
   *
   * @param root a TreeNode
   * @param p p node in the TreeNode
   * @param q q node in the TreeNode
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
   * Two binary trees are considered the same if they are structurally identical and the nodes have
   * the same value.
   * <p>
   * Example 1:
   * <p>
   * Input: 1         1 / \       / \ 2   3     2   3
   *
   * [1,2,3],   [1,2,3]
   *
   * <p>
   * Output: true Example 2:
   * <p>
   * Input:     1         1 /           \ 2             2
   *
   * [1,2],     [1,null,2]
   *
   * <p>
   * Output: false Example 3:
   * <p>
   * Input:     1         1 / \       / \ 2   1     1   2
   *
   * [1,2,1],   [1,1,2]
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
   * 1 / \ 2   2 / \ / \
   * <p>
   * 3  4 4  3 But the following [1,2,2,null,3,null,3] is not:
   *
   * 1 / \ 2   2 \   \ 3    3
   * <p>
   * Note: Bonus points if you could solve it both recursively and iteratively.
   *
   * @param root a TreeNode
   * @return is symmetric tree
   */
  public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;
    if (root.left == null && root.right == null) return true;
    if (root.left == null || root.right == null) return false;
    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) return true;
    if (left == null || right == null) return false;
    if (left.val != right.val) return false;
    return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
  }

  /**
   * 103. Binary Tree Zigzag Level Order Traversal [Medium]
   * <p>
   * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from
   * left to right, then right to left for the next level and alternate between).
   * <p>
   * For example: Given binary tree [3,9,20,null,null,15,7],
   *
   * 3 / \ 9  20 /  \ 15   7
   * <p>
   * return its zigzag level order traversal as:
   * <p>
   * [ [3], [20,9], [15,7] ]
   *
   * @param root a TreeNode
   * @return zigzag level order traversal
   */
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    boolean fromLeft = true;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      int size = stack.size();
      Stack<TreeNode> temp = new Stack<>();
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode node = stack.pop();
        list.add(node.val);
        if (fromLeft) {
          if (node.left != null) temp.push(node.left);
          if (node.right != null) temp.push(node.right);
        } else {
          if (node.right != null) temp.push(node.right);
          if (node.left != null) temp.push(node.left);
        }
      }
      stack.addAll(temp);
      result.add(list);
      fromLeft = !fromLeft;
    }
    return result;
  }

  /**
   * 105. Construct Binary Tree from Preorder and Inorder [Medium]
   * <p>
   * Given preorder and inorder traversal of a tree, construct the binary tree.
   * <p>
   * Note: You may assume that duplicates do not exist in the tree.
   * <p>
   * For example, given
   * <p>
   * preorder = [3,9,20,15,7] inorder = [9,3,15,20,7] Return the following binary tree:
   *
   * 3 / \ 9  20 /  \ 15   7
   *
   * @param preorder preorder of a binary tree
   * @param inorder inorder of a binary tree
   * @return binary tree
   */
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    return helper(preorder, inorder, 0, 0, inorder.length - 1);
  }

  private TreeNode helper(int[] preorder, int[] inorder, int preStart, int inStart, int inEnd) {
    if (preStart >= preorder.length || inStart >= inorder.length || inEnd < inStart) {
      return null;
    }
    TreeNode root = new TreeNode(preorder[preStart]);
    int index = 0;
    for (int i = inStart; i <= inEnd; i++) {
      if (inorder[i] == root.val) {
        index = i;
        break;
      }
    }
    root.left = helper(preorder, inorder, preStart + 1, inStart, index - 1);
    root.right = helper(preorder, inorder, preStart + index - inStart + 1, index + 1, inEnd);
    return root;
  }

  /**
   * 109. Convert Sorted List to Binary Search Tree [Medium]
   * <p>
   * Given a singly linked list where elements are sorted in ascending order, convert it to a height
   * balanced BST.
   * <p>
   * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth
   * of the two subtrees of every node never differ by more than 1.
   * <p>
   * Example:
   * <p>
   * Given the sorted linked list: [-10,-3,0,5,9],
   * <p>
   * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced
   * BST:
   * <p>
   *
   * 0 / \ -3   9 /   / -10  5
   */
  public TreeNode sortedListToBST(ListNode head) {
    if (head == null) return null;
    ListNode pre = head;
    ListNode mid = head;
    ListNode next = head;
    while (next.next != null && next.next.next != null) {
      pre = mid;
      mid = mid.next;
      next = next.next.next;
    }
    TreeNode root = new TreeNode(mid.val);
    if (pre != mid) {
      pre.next = null;
      root.left = sortedListToBST(head);
    }
    root.right = sortedListToBST(mid.next);
    return root;
  }

  /**
   * 110. Balanced Binary Tree [Easy]
   * <p>
   * Given a binary tree, determine if it is height-balanced.
   * <p>
   * For this problem, a height-balanced binary tree is defined as:
   * <p>
   * a binary tree in which the depth of the two subtrees of every node never differ by more than
   * 1.
   * <p>
   * Example 1:
   * <p>
   * Given the following tree [3,9,20,null,null,15,7]:
   *
   * 3 / \ 9  20 /  \ 15   7 Return true.
   * <p>
   * Example 2:
   * <p>
   * Given the following tree [1,2,2,3,3,null,null,4,4]:
   *
   * 1 / \ 2   2 / \ 3   3 / \ 4   4 Return false.
   *
   * @param root a binary tree
   * @return is balanced
   */
  public boolean isBalanced(TreeNode root) {
    if (root == null) return true;
    if (root.left == null && root.right == null) return true;
    int diff = Math.abs(maxDepth(root.left) - maxDepth(root.right));
    return diff <= 1 && isBalanced(root.left) && isBalanced(root.right);
  }

  private int maxDepth(TreeNode root) {
    if (root == null) return 0;
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }

  /**
   * 111. Minimum Depth of Binary Tree [Easy]
   * <p>
   * Given a binary tree, find its minimum depth.
   * <p>
   * The minimum depth is the number of nodes along the shortest path from the root node down to the
   * nearest leaf node.
   * <p>
   * Note: A leaf is a node with no children.
   * <p>
   * Example:
   * <p>
   * Given binary tree [3,9,20,null,null,15,7],
   *
   * 3 / \ 9  20 /  \ 15   7 return its minimum depth = 2.
   *
   * @param root a binary tree
   * @return min depth
   */
  public int minDepth(TreeNode root) {
    if (root == null) return 0;
    if (root.left == null && root.right == null) return 1;
    int md = Integer.MAX_VALUE;
    if (root.left != null) md = Math.min(md, minDepth(root.left));
    if (root.right != null) md = Math.min(md, minDepth(root.right));
    return md + 1;
  }

  /**
   * 113. Path Sum II [Medium]
   * <p>
   * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the
   * given sum.
   * <p>
   * Note: A leaf is a node with no children.
   * <p>
   * Example:
   * <p>
   * Given the below binary tree and sum = 22,
   *
   * 5 / \ 4   8 /   / \ 11  13  4 /  \    / \ 7    2  5   1 Return:
   * <p>
   * [ [5,4,11,2], [5,8,4,5] ]
   *
   * @param root a binary tree
   * @param sum target path sum
   * @return paths
   */
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    return pathSum(root, sum, new ArrayList<>());
  }

  private List<List<Integer>> pathSum(TreeNode root, int sum, List<Integer> list) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    list.add(root.val);
    if (root.val == sum && root.left == null && root.right == null) {
      result.add(list);
    } else {
      List<Integer> l1 = new ArrayList<>(list);
      result.addAll(pathSum(root.left, sum - root.val, l1));
      List<Integer> l2 = new ArrayList<>(list);
      result.addAll(pathSum(root.right, sum - root.val, l2));
    }
    return result;
  }

  /**
   * 114. Flatten Binary Tree to Linked List [Medium]
   * <p>
   * Given a binary tree, flatten it to a linked list in-place.
   * <p>
   * For example, given the following tree:
   *
   * 1 / \ 2   5 / \   \ 3   4   6 The flattened tree should look like:
   * <p>
   * 1 \ 2 \ 3 \ 4 \ 5 \ 6
   *
   * @param root a binary tree
   */
  public void flatten(TreeNode root) {
    if (root == null) return;

    TreeNode left = root.left;
    TreeNode right = root.right;
    root.left = null;

    flatten(left);
    flatten(right);

    root.right = left;
    TreeNode cur = root;
    while (cur.right != null) cur = cur.right;
    cur.right = right;
  }

  /**
   * 426. Convert Binary Search Tree to Sorted Doubly Linked List [Medium]
   *
   * Convert a BST to a sorted circular doubly-linked list in-place. Think of the left and right
   * pointers as synonymous to the previous and next pointers in a doubly-linked list.
   *
   * Let's take the following BST as an example, it may help you understand the problem better:
   *
   * We want to transform this BST into a circular doubly linked list. Each node in a doubly linked
   * list has a predecessor and successor. For a circular doubly linked list, the predecessor of the
   * first element is the last element, and the successor of the last element is the first element.
   *
   * The figure below shows the circular doubly linked list for the BST above. The "head" symbol
   * means the node it points to is the smallest element of the linked list.
   *
   * Specifically, we want to do the transformation in place. After the transformation, the left
   * pointer of the tree node should point to its predecessor, and the right pointer should point to
   * its successor. We should return the pointer to the first element of the linked list.
   *
   * The figure below shows the transformed BST. The solid line indicates the successor
   * relationship, while the dashed line means the predecessor relationship.
   *
   * @param root a binary tree
   * @return a doubly linked list
   */
  public TreeNode treeToDoublyList(TreeNode root) {
    if (root == null) return null;
    TreeNode head = null;
    TreeNode next = null;
    Stack<TreeNode> stack = new Stack<>();
    while (root != null || !stack.isEmpty()) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (head == null) {
        head = new TreeNode(root.val);
        head.val = root.val;
        next = head;
      } else {
        next.right = new TreeNode(root.val);
        next.right.left = next;
        next = next.right;
        next.val = root.val;
      }
      root = root.right;
    }
    head.left = next;
    next.right = head;
    return head;
  }

  /**
   * 314. Binary Tree Vertical Order Traversal [Medium]
   *
   * Given a binary tree, return the vertical order traversal of its nodes' values. (ie, from top to
   * bottom, column by column).
   *
   * If two nodes are in the same row and column, the order should be from left to right.
   *
   * Examples 1:
   *
   * Input: [3,9,20,null,null,15,7]
   *
   * 3
   *
   * /\
   *
   * /  \
   *
   * 9  20
   *
   * /\
   *
   * /  \
   *
   * 15   7
   *
   * Output:
   *
   * [
   *
   * [9],
   *
   * [3,15],
   *
   * [20],
   *
   * [7]
   *
   * ]
   *
   * Examples 2:
   *
   * Input: [3,9,8,4,0,1,7]
   *
   * 3
   *
   * /\
   *
   * /  \
   *
   * 9   8
   *
   * /\  /\
   *
   * /  \/  \
   *
   * 4  01   7
   *
   * Output:
   *
   * [
   *
   * [4],
   *
   * [9],
   *
   * [3,0,1],
   *
   * [8],
   *
   * [7]
   *
   * ]
   *
   * Examples 3:
   *
   * Input: [3,9,8,4,0,1,7,null,null,null,2,5] (0's right child is 2 and 1's left child is 5)
   *
   * 3
   *
   * /\
   *
   * /  \
   *
   * 9   8
   *
   * /\  /\
   *
   * /  \/  \
   *
   * 4  01   7
   *
   * /\
   *
   * /  \
   *
   * 5   2
   *
   * Output:
   *
   * [
   *
   * [4],
   *
   * [9,5],
   *
   * [3,0,1],
   *
   * [8,2],
   *
   * [7]
   *
   * ]
   */
  public List<List<Integer>> verticalOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) return result;
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<Integer> levels = new LinkedList<>();
    Map<Integer, List<Integer>> map = new HashMap<>();
    queue.offer(root);
    levels.offer(0);
    int minLev = Integer.MAX_VALUE;
    int maxLev = Integer.MIN_VALUE;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();
        int level = levels.poll();
        minLev = Math.min(minLev, level);
        maxLev = Math.max(maxLev, level);
        process(node, level, map);
        if (node.left != null) {
          queue.offer(node.left);
          levels.offer(level - 1);
        }
        if (node.right != null) {
          queue.offer(node.right);
          levels.offer(level + 1);
        }
      }
    }
    for (int i = minLev; i <= maxLev; i++) {
      result.add(map.get(i));
    }
    return result;
  }

  private void process(TreeNode root, int level, Map<Integer, List<Integer>> map) {
    if (root == null) return;
    if (!map.containsKey(level)) {
      map.put(level, new ArrayList<>());
    }
    map.get(level).add(root.val);
  }

  /**
   * 543. Diameter of Binary Tree [Easy]
   *
   * Given a binary tree, you need to compute the length of the diameter of the tree. The diameter
   * of a binary tree is the length of the longest path between any two nodes in a tree. This path
   * may or may not pass through the root.
   *
   * Example: Given a binary tree
   *
   * 1
   *
   * / \
   *
   * 2   3
   *
   * / \
   *
   * 4   5
   *
   * Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].
   *
   * Note: The length of path between two nodes is represented by the number of edges between them.
   *
   * @param root a TreeNode
   * @return diameter of the TreeNode
   */
  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) return 0;
    int d1 = depth(root.left) + depth(root.right);
    int d2 = diameterOfBinaryTree(root.left);
    int d3 = diameterOfBinaryTree(root.right);
    return Math.max(d1, Math.max(d2, d3));
  }

  private int depth(TreeNode root) {
    if (root == null) return 0;
    if (diameterCache.containsKey(root)) {
      return diameterCache.get(root);
    }
    int depth = 1 + Math.max(depth(root.left), depth(root.right));
    diameterCache.put(root, depth);
    return diameterCache.get(root);
  }

  /**
   * 98. Validate Binary Search Tree [Medium]
   *
   * Given a binary tree, determine if it is a valid binary search tree (BST).
   *
   * Assume a BST is defined as follows:
   *
   * The left subtree of a node contains only nodes with keys less than the node's key. The right
   * subtree of a node contains only nodes with keys greater than the node's key. Both the left and
   * right subtrees must also be binary search trees.
   *
   *
   * Example 1:
   *
   * 2
   *
   * / \
   *
   * 1   3
   *
   * Input: [2,1,3]
   *
   * Output: true
   *
   * Example 2:
   *
   * 5
   *
   * / \
   *
   * 1   4
   *
   * / \
   *
   * 3   6
   *
   * Input: [5,1,4,null,null,3,6]
   *
   * Output: false
   *
   * Explanation: The root node's value is 5 but its right child's value is 4.
   *
   * @param root a TreeNode
   * @return is valid binary true
   */
  public boolean isValidBST(TreeNode root) {
    if (root == null) return true;
    if (!isValidBST(root.left)) return false;
    if (prev != null && root.val <= prev.val) {
      return false;
    }
    prev = root;
    return isValidBST(root.right);
  }
}
