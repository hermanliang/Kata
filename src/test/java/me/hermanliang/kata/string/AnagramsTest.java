package me.hermanliang.kata.string;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AnagramsTest {

    @Test
    public void groupAnagrams() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> list1 = Collections.singletonList("bat");
        List<String> list2 = Arrays.asList("nat", "tan");
        List<String> list3 = Arrays.asList("ate", "eat", "tea");

        List<List<String>> output = new Anagrams().groupAnagrams(strs);
        for (List<String> strings : output) {
            List<String> list = null;
            switch (strings.size()) {
                case 1:
                    list = list1;
                    break;
                case 2:
                    list = list2;
                    break;
                case 3:
                    list = list3;
                    break;
                default:
                    fail();
            }
            for (String s : list) {
                assertTrue(strings.contains(s));
            }
        }
    }
}