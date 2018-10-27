package me.hermanliang.kata.string;

/**
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/description/">
 * https://leetcode.com/problems/longest-common-prefix/description/</a>
 */
public class LongestPrefix {

    /**
     * 14. Longest Common Prefix [Easy]
     * <p>
     * Write a function to find the longest common prefix string amongst an array of strings.
     * If there is no common prefix, return an empty string "".
     * <p>
     * Note:
     * All given inputs are in lowercase letters a-z.
     *
     * @param strs array of strings
     * @return longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int minLen = Integer.MAX_VALUE;
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            minLen = Math.min(str.length(), minLen);
        }
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            if (isEqualChar(strs, i, c)) {
                result.append(c);
            } else {
                break;
            }
        }
        return result.toString();
    }

    private boolean isEqualChar(String[] strs, int i, char c) {
        for (String str : strs) {
            if (c != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
