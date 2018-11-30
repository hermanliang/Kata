package me.hermanliang.kata.string;

/**
 * @see <a href="https://leetcode.com/problems/implement-strstr/description/">
 * https://leetcode.com/problems/implement-strstr/description/</a>
 */
public class StringOperation {

    /**
     * 28. Implement strStr() [Easy]
     * <p>
     * Implement strStr().
     * <p>
     * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * <p>
     * Example 1:
     * <p>
     * Input: haystack = "hello", needle = "ll"
     * Output: 2
     * Example 2:
     * <p>
     * Input: haystack = "aaaaa", needle = "bba"
     * Output: -1
     * Clarification:
     * <p>
     * What should we return when needle is an empty string? This is a great question to ask during an interview.
     * <p>
     * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to
     * C's strstr() and Java's indexOf().
     *
     * @param haystack haystack
     * @param needle   needle
     * @return index of the first occurrence of needle in haystack
     */
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack == null ||
                needle.length() > haystack.length()) return -1;
        if (needle.length() == haystack.length()) return haystack.equals(needle) ? 0 : -1;
        int len = needle.length();
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (strStr(haystack.substring(i, i + len), needle) == 0) {
                return i;
            }
        }
        return -1;
    }
}
