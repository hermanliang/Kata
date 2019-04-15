package me.hermanliang.kata.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/">
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/</a>
 */
public class LetterCombination {

  /**
   * 17. Letter Combinations of a Phone Number [Medium]
   * <p>
   * Given a string containing digits from 2-9 inclusive, return all possible letter combinations
   * that the number could represent. A mapping of digit to letters (just like on the telephone
   * buttons) is given below. Note that 1 does not map to any letters.
   * <p>
   * Example:
   * <p>
   * Input: "23" Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
   * <p>
   * Note:
   * <p>
   * Although the above answer is in lexicographical order, your answer could be in any order you
   * want.
   *
   * @param digits digits
   * @return all possible letter combinations
   */
  public List<String> letterCombinations(String digits) {
    List<String> result = new ArrayList<>();
    if (digits == null || digits.isEmpty()) return result;
    letterCombinations(result, new StringBuilder(digits.length()), digits, 0);
    return result;
  }

  private void letterCombinations(List<String> container, StringBuilder sb, String digits, int i) {
    if (i == digits.length()) {
      container.add(sb.toString());
      return;
    }
    int index = i++;
    char c = digits.charAt(index);
    switch (c) {
      case '2':
        letterCombinations(container, sb.append("a"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("b"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("c"), digits, i);
        sb.deleteCharAt(index);
        break;
      case '3':
        letterCombinations(container, sb.append("d"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("e"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("f"), digits, i);
        sb.deleteCharAt(index);
        break;
      case '4':
        letterCombinations(container, sb.append("g"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("h"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("i"), digits, i);
        sb.deleteCharAt(index);
        break;
      case '5':
        letterCombinations(container, sb.append("j"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("k"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("l"), digits, i);
        sb.deleteCharAt(index);
        break;
      case '6':
        letterCombinations(container, sb.append("m"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("n"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("o"), digits, i);
        sb.deleteCharAt(index);
        break;
      case '7':
        letterCombinations(container, sb.append("p"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("q"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("r"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("s"), digits, i);
        sb.deleteCharAt(index);
        break;
      case '8':
        letterCombinations(container, sb.append("t"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("u"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("v"), digits, i);
        sb.deleteCharAt(index);
        break;
      case '9':
        letterCombinations(container, sb.append("w"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("x"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("y"), digits, i);
        sb.deleteCharAt(index);
        letterCombinations(container, sb.append("z"), digits, i);
        sb.deleteCharAt(index);
        break;
    }
  }
}
