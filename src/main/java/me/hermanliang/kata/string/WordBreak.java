package me.hermanliang.kata.string;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @see <a href="https://leetcode.com/problems/word-break/description/">
 * https://leetcode.com/problems/word-break/description/</a>
 */
public class WordBreak {

  /**
   * 139. Word Break [Medium]
   * <p>
   * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
   * determine if s can be segmented into a space-separated sequence of one or more dictionary
   * words.
   * <p>
   * Note:
   * <p>
   * The same word in the dictionary may be reused multiple times in the segmentation. You may
   * assume the dictionary does not contain duplicate words. Example 1:
   * <p>
   * Input: s = "leetcode", wordDict = ["leet", "code"] Output: true Explanation: Return true
   * because "leetcode" can be segmented as "leet code". Example 2:
   * <p>
   * Input: s = "applepenapple", wordDict = ["apple", "pen"] Output: true Explanation: Return true
   * because "applepenapple" can be segmented as "apple pen apple". Note that you are allowed to
   * reuse a dictionary word. Example 3:
   * <p>
   * Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"] Output: false
   *
   * @param s a string
   * @param wordDict word dictionary
   * @return the string can be segmented into a space-separated sequence of one or more dictionary
   * words.
   */
  public boolean wordBreak(String s, List<String> wordDict) {
    Queue<String> queue = new LinkedList<>();
    queue.offer(s);
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        String node = queue.poll();
        for (String word : wordDict) {
          if (node.indexOf(word) == 0) {
            String cut = node.substring(word.length());
            if (cut.isEmpty()) return true;
            if (!queue.contains(cut)) {
              queue.offer(cut);
            }
          }
        }
      }
    }
    return false;
  }
}
