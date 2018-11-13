package me.hermanliang.kata.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://leetcode.com/problems/generate-parentheses/description/">
 * https://leetcode.com/problems/generate-parentheses/description/</a>
 */
public class GenerateParentheses {

    /**
     * 22. Generate Parentheses [Medium]
     * <p>
     * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
     * <p>
     * For example, given n = 3, a solution set is:
     * <p>
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     *
     * @param n pairs of parentheses
     * @return list of well-formed parentheses
     */
    public List<String> generateParenthesis(int n) {
        List<String> container = new ArrayList<>();
        generateParenthesis(container, n, "", 0, 0);
        return container;
    }

    public void generateParenthesis(List<String> container, int n, String s, int open, int close) {
        if (s.length() == n * 2) {
            container.add(s);
            return;
        }
        if (open < n) {
            generateParenthesis(container, n, s + "(", open + 1, close);
        }
        if (close < open) {
            generateParenthesis(container, n, s + ")", open, close + 1);
        }
    }
}
