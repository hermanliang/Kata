package me.hermanliang.kata.linked_list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.hermanliang.kata.util.NestedInteger;

/**
 * @see <a href="https://leetcode.com/problems/flatten-nested-list-iterator/description/">
 * https://leetcode.com/problems/flatten-nested-list-iterator/description/</a>
 */
public class NestedIterator implements Iterator<Integer> {

  LinkedList<Integer> queue;

  /**
   * 341. Flatten Nested List Iterator [Medium]
   * <p>
   * Given a nested list of integers, implement an iterator to flatten it.
   * <p>
   * Each element is either an integer, or a list -- whose elements may also be integers or other
   * lists.
   * <p>
   * Example 1:
   * <p>
   * Input: [[1,1],2,[1,1]] Output: [1,1,2,1,1] Explanation: By calling next repeatedly until
   * hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1]. Example
   * 2:
   * <p>
   * Input: [1,[4,[6]]] Output: [1,4,6] Explanation: By calling next repeatedly until hasNext
   * returns false, the order of elements returned by next should be: [1,4,6].
   *
   * @param nestedList a nested list of integers
   */
  public NestedIterator(List<NestedInteger> nestedList) {
    this.queue = flatten(nestedList);
  }

  @Override
  public boolean hasNext() {
    return !queue.isEmpty();
  }

  @Override
  public Integer next() {
    return queue.poll();
  }

  private LinkedList<Integer> flatten(List<NestedInteger> nestedList) {
    LinkedList<Integer> list = new LinkedList<>();
    for (NestedInteger i : nestedList) {
      if (i.isInteger()) {
        list.add(i.getInteger());
      } else {
        list.addAll(flatten(i.getList()));
      }
    }
    return list;
  }
}
