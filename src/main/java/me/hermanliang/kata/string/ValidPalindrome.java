package me.hermanliang.kata.string;

/**
 * @see <a href="https://leetcode.com/problems/valid-palindrome/description/">
 * https://leetcode.com/problems/valid-palindrome/description/</a>
 * @see <a href="https://leetcode.com/problems/valid-palindrome-ii/">
 * https://leetcode.com/problems/valid-palindrome-ii/</a>
 */
public class ValidPalindrome {

    /**
     * 125. Valid Palindrome [Easy]
     * <p>
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     * <p>
     * Note: For the purpose of this problem, we define empty string as valid palindrome.
     * <p>
     * Example 1:
     * <p>
     * Input: "A man, a plan, a canal: Panama"
     * Output: true
     * Example 2:
     * <p>
     * Input: "race a car"
     * Output: false
     *
     * @param s a string
     * @return is the string palindrome
     */
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        char sc;
        char ec;
        boolean pass;
        while (end > start) {
            sc = s.charAt(start);
            ec = s.charAt(end);
            pass = false;
            if ((sc < 'a' || sc > 'z') && (sc < '0' || sc > '9')) {
                start++;
                pass = true;
            }
            if ((ec < 'a' || ec > 'z') && (ec < '0' || ec > '9')) {
                end--;
                pass = true;
            }
            if (pass) continue;
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }

    /**
     * 680. Valid Palindrome II [Easy]
     * <p>
     * Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.
     * <p>
     * Example 1:
     * <p>
     * Input: "aba"
     * Output: True
     * Example 2:
     * <p>
     * Input: "abca"
     * Output: True
     * Explanation: You could delete the character 'c'.
     * Note:
     * <p>
     * The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
     *
     * @param s a string
     * @return is valid palindrome
     */
    public boolean validPalindrome(String s) {
        return false;
    }
}
