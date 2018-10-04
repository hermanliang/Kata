package me.hermanliang.kata.string;

/**
 * @see <a href="https://leetcode.com/problems/zigzag-conversion/description/">
 * https://leetcode.com/problems/zigzag-conversion/description/</a>
 */
public class ZigZag {

    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
     * of rows like this: (you may want to display this pattern in a fixed font for
     * better legibility)
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * <p>
     * And then read line by line: "PAHNAPLSIIGYIR"
     *
     * @param input input string
     * @param rows  ZigZag rows
     * @return output string
     */
    public String convert(String input, int rows) {
        if (rows == 1) return input;
        int step = 1;
        int index = 0;
        int lastIndex = rows - 1;
        StringBuilder[] rowStrings = new StringBuilder[rows];
        for (char c : input.toCharArray()) {
            if (rowStrings[index] == null) {
                rowStrings[index] = new StringBuilder();
            }
            rowStrings[index].append(c);
            index += step;
            if (index == 0) {
                step = 1;
            } else if (index == lastIndex) {
                step = -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder rowString : rowStrings) {
            if (rowString != null) {
                sb.append(rowString);
            }
        }
        return sb.toString();
    }

}
