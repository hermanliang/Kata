package me.hermanliang.kata.math;

/**
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-title/description/">
 * https://leetcode.com/problems/excel-sheet-column-title/description/</a>
 */
public class ExcelSheet {

  /**
   * 168. Excel Sheet Column Title [Easy]
   * <p>
   * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
   * <p>
   * For example:
   * <p>
   * 1 -> A 2 -> B 3 -> C ... 26 -> Z 27 -> AA 28 -> AB ... Example 1:
   * <p>
   * Input: 1 Output: "A" Example 2:
   * <p>
   * Input: 28 Output: "AB" Example 3:
   * <p>
   * Input: 701 Output: "ZY"
   *
   * @param n a integer
   * @return corresponding column title
   */
  public String convertToTitle(int n) {
    StringBuilder sb = new StringBuilder();
    while (n > 0) {
      sb.insert(0, (char) ((n - 1) % 26 + 'A'));
      n = (n - 1) / 26;
    }
    return sb.toString();
  }
}
