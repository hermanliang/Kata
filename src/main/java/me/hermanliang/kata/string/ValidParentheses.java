package me.hermanliang.kata.string;

import java.util.Stack;

/**
 * @see <a href="https://leetcode.com/problems/valid-parentheses/description/">
 * https://leetcode.com/problems/valid-parentheses/description/</a>
 */
public class ValidParentheses {

  /**
   * 20. Valid Parentheses [Easy]
   * <p>
   * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
   * input string is valid.
   * <p>
   * An input string is valid if:
   * <p>
   * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the
   * correct order. Note that an empty string is also considered valid.
   *
   * @param s input string
   * @return is valid parentheses or not
   */
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      switch (c) {
        case '(':
        case '{':
        case '[':
          stack.push(c);
          break;
        case ')':
          if (stack.isEmpty() || stack.pop() != '(') return false;
          break;
        case '}':
          if (stack.isEmpty() || stack.pop() != '{') return false;
          break;
        case ']':
          if (stack.isEmpty() || stack.pop() != '[') return false;
          break;
      }
    }
    return stack.isEmpty();
  }
}
