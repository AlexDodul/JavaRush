package Task19;

import java.util.ArrayList;
import java.util.Arrays;

/*You will be given an vector of string(s).
You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars)
and then return the first value.

The returned value must be a string, and have "***" between each of its letters.

You should not remove or add elements from/to the array.*/

public class Solution {
    public static void main(String[] args) {
        String[] q = new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"};
        System.out.println(twoSort(q));

    }
    public static String twoSort(String[] s) {

        for (int j = 0; j < s.length; j++) {
            for (int i = j + 1; i < s.length; i++) {
                if (s[i].compareTo(s[j]) < 0) {
                    String k = s[j];
                    s[j] = s[i];
                    s[i] = k;
                }
            }
        }

        //Arrays.sort(s);
        StringBuilder sb = new StringBuilder(s[0].replaceAll("", "***"));
        sb.delete(0, 3);
        sb.reverse();
        sb.delete(0, 3);
        sb.reverse();

        return sb.toString();
    }
}
