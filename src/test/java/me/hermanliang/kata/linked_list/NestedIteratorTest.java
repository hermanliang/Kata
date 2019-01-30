package me.hermanliang.kata.linked_list;

import me.hermanliang.kata.util.NestedInteger;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class NestedIteratorTest {

    @Test
    public void test1() {
        List<NestedInteger> nestedList = Arrays.asList(
                NestedInteger.createFromList(Arrays.asList(
                        NestedInteger.createFromInteger(1),
                        NestedInteger.createFromInteger(1)
                )),
                NestedInteger.createFromInteger(2),
                NestedInteger.createFromList(Arrays.asList(
                        NestedInteger.createFromInteger(1),
                        NestedInteger.createFromInteger(1)
                ))
        );
        int[] expected = {1, 1, 2, 1, 1};
        NestedIterator iterator = new NestedIterator(nestedList);
        for (int num : expected) {
            assertTrue(iterator.hasNext());
            assertEquals(num, (int) iterator.next());
        }
        assertFalse(iterator.hasNext());
    }

    @Test
    public void test2() {
        List<NestedInteger> nestedList = Arrays.asList(
                NestedInteger.createFromInteger(1),
                NestedInteger.createFromList(Arrays.asList(
                        NestedInteger.createFromInteger(4),
                        NestedInteger.createFromList(Collections.singletonList(
                                NestedInteger.createFromInteger(6)
                        ))
                ))
        );
        int[] expected = {1, 4, 6};
        NestedIterator iterator = new NestedIterator(nestedList);
        for (int num : expected) {
            assertTrue(iterator.hasNext());
            assertEquals(num, (int) iterator.next());
        }
        assertFalse(iterator.hasNext());
    }
}