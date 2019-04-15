package me.hermanliang.kata.array;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @see <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/description/">
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description/</a>
 */
public class LargestElement {

  /**
   * 215. Kth Largest Element in an Array [Medium]
   * <p>
   * Find the kth largest element in an unsorted array. Note that it is the kth largest element in
   * the sorted order, not the kth distinct element.
   * <p>
   * Example 1:
   * <p>
   * Input: [3,2,1,5,6,4] and k = 2 Output: 5 Example 2:
   * <p>
   * Input: [3,2,3,1,2,4,5,5,6] and k = 4 Output: 4 Note: You may assume k is always valid, 1 ≤ k ≤
   * array's length.
   *
   * @param nums an integer array
   * @param k k
   * @return kth largest element in the sorted integer array
   */
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> priorityQueue =
        new PriorityQueue<>(nums.length, new Comparator<Integer>() {
          @Override
          public int compare(Integer o1, Integer o2) {
            return o2 - o1;
          }
        });
    for (int num : nums) {
      priorityQueue.add(num);
    }
    int output = 0;
    while (k-- > 0) {
      output = priorityQueue.poll();
    }
    return output;
  }
}
