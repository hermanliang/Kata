package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/description/">
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/</a>
 * @see <a href="https://leetcode.com/problems/merge-sorted-array/description/">
 * https://leetcode.com/problems/merge-sorted-array/description/</a>
 */
public class SortedArray {

    /**
     * 4. Median of Two Sorted Arrays [Hard]
     * <p>
     * There are two sorted arrays nums1 and nums2 of size m and n respectively.
     * Find the median of the two sorted arrays. The overall run time complexity
     * should be O(log (m+n)).
     * You may assume nums1 and nums2 cannot be both empty.
     *
     * @param nums1 nums1
     * @param nums2 nums2
     * @return median of the two sorted arrays
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        // always keep m <= n
        if (m > n) {
            int[] tmpArray = nums1;
            nums1 = nums2;
            nums2 = tmpArray;
            int tmpIndex = m;
            m = n;
            n = tmpIndex;
        }
        int left = 0;
        int right = m;
        int avgLen = (m + n + 1) / 2;
        while (left <= right) {
            int i = (left + right) / 2;
            int j = avgLen - i;
            if (i < right && nums2[j - 1] > nums1[i]) {
                // i is too small
                left = i + 1;
            } else if (i > left && nums1[i - 1] > nums2[j]) {
                // i is too big
                right = i - 1;
            } else {
                // calculate median
                int maxLeft;
                if (i == 0) {
                    maxLeft = nums2[j - 1];
                } else if (j == 0) {
                    maxLeft = nums1[i - 1];
                } else {
                    maxLeft = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    // return maxLeft if total length is an odd
                    return maxLeft;
                }

                int minRight;
                if (i == m) {
                    minRight = nums2[j];
                } else if (j == n) {
                    minRight = nums1[i];
                } else {
                    minRight = Math.min(nums2[j], nums1[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

    /**
     * 88. Merge Sorted Array [Easy]
     * <p>
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     * <p>
     * Note:
     * <p>
     * The number of elements initialized in nums1 and nums2 are m and n respectively.
     * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
     * Example:
     * <p>
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * <p>
     * Output: [1,2,2,3,5,6]
     *
     * @param nums1 sorted array with space >= (m + n)
     * @param m     number of elements in nums1
     * @param nums2 sorted array
     * @param n     number of elements in nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // two pointer approach
        // set data from index (m + n - 1) to 0, use k to identify the set data index
        // get nums1 element from index m - 1 to 0, use i to identify index of nums1 element
        // get nums2 element from index n - 1 to 0, use j to identify index of nums2 element
        // if nums1[i] > nums2[j] -> nums1[k--] = nums1[i--]
        // else nums1[k--] = nums2[j--]
        int i = m - 1;
        int j = n - 1;
        int k  = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
