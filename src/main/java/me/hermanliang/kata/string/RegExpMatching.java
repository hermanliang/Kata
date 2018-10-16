package me.hermanliang.kata.string;

/**
 * @see <a href="https://leetcode.com/problems/regular-expression-matching/description/">
 * https://leetcode.com/problems/regular-expression-matching/description/</a>
 */
public class RegExpMatching {

    /**
     * 10. Regular Expression Matching
     * <p>
     * Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'.
     * <p>
     * '.' Matches any single character.
     * '*' Matches zero or more of the preceding element.
     * <p>
     * The matching should cover the entire input string (not partial).
     * <p>
     * Note:
     * s could be empty and contains only lowercase letters a-z.
     * p could be empty and contains only lowercase letters a-z, and characters like . or *.
     *
     * @param s input string
     * @param p pattern
     * @return is match or not
     */
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean isFirstMatch = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        if (p.length() > 1 && p.charAt(1) == '*') {
            return isMatch(s, p.substring(2)) ||
                    (isFirstMatch && isMatch(s.substring(1), p));
        }
        return isFirstMatch && isMatch(s.substring(1), p.substring(1));
    }
}
