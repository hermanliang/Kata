package me.hermanliang.kata.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/</a>
 * @see <a href="https://leetcode.com/problems/longest-palindromic-substring/description/">
 * https://leetcode.com/problems/longest-palindromic-substring/description/</a>
 */
public class LongestSubstring {

    /**
     * Given a string, find the length of the longest substring without repeating characters.
     *
     * @param input input string
     * @return length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String input) {
        int ans = 0;
        int i = 0;
        int j = 0;
        int len = input.length();
        Set<Character> holder = new HashSet<>();
        while (i < len && j < len && ans < (len - i)) {
            if (!holder.contains(input.charAt(j))) {
                holder.add(input.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                holder.remove(input.charAt(i++));
            }
        }
        return ans;
    }

    /**
     * Given a string s, find the longest palindromic substring in s.
     * You may assume that the maximum length of s is 1000.
     *
     * @param input input string
     * @return longest palindromic substring
     */
    public String longestPalindrome(String input) {
        return null;
    }
}
