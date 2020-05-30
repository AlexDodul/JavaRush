package Task12;

public class Solution {
    public static void main(String[] args) {
        String word1 = "";
        String word2 = "7";
        String word3 = " ";
        String word4 = "a";
        String word5 = "a5";
        String word6 = "14";

        System.out.println(isDigit(word1));
        System.out.println(isDigit(word2));
        System.out.println(isDigit(word3));
        System.out.println(isDigit(word4));
        System.out.println(isDigit(word5));
        System.out.println(isDigit(word6));

    }
    public static boolean isDigit(String s) {
        // your code goes here
        return s.matches("[0-9]");
    }
}
