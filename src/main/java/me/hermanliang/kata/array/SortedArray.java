package me.hermanliang.kata.array;

/**
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/description/">
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/</a>
 */
public class SortedArray {

    /**
     * 4. Median of Two Sorted Arrays
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

}
