package Task13;

/*It's pretty straightforward. Your goal is to create a function that removes the first
and last characters of a string. You're given one parameter, the original string.
You don't have to worry with strings with less than two characters.*/

public class Solution {
    public static void main(String[] args) {
        String s1 = "JavaIsCool";
        System.out.println(remove(s1));

    }
    public static String remove(String str) {
        // your code here
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        str = stringBuilder.toString();
        return str;
    }
}
