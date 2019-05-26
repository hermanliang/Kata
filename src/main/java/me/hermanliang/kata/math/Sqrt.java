package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/sqrtx/">
 * https://leetcode.com/problems/sqrtx/</a>
 */
public class Sqrt {

  /**
   * 69. Sqrt(x) [Easy]
   *
   * Implement int sqrt(int x).
   *
   * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
   *
   * Since the return type is an integer, the decimal digits are truncated and only the integer part
   * of the result is returned.
   *
   * Example 1:
   *
   * Input: 4
   *
   * Output: 2
   *
   * Example 2:
   *
   * Input: 8
   *
   * Output: 2
   *
   * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is
   * returned.
   *
   * @param x an integer
   * @return square root of x
   */
  public int mySqrt(int x) {
    if (x == 0) return 0;
    long start = 1;
    long end = x;
    while (end > start) {
      long mid = start + (end - start + 1) / 2;
      if (x == mid * mid) {
        return (int) mid;
      } else if (x > mid * mid) {
        start = mid;
      } else {
        end = mid - 1;
      }
    }
    return (int) start;
  }
}
