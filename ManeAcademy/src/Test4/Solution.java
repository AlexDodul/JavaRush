package Test4;

public class Solution {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";
        String s3 = "hjghlj";
        System.out.println(getLastCharacter(s1));
        System.out.println(getLastCharacter(s2));
        System.out.println(getLastCharacter(s3));
    }
    public static char getLastCharacter(String input) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (input == null || input.length() == 0){
            return 48;
        }
        else {
            char[] chars = input.toCharArray();
            char last = chars[chars.length - 1];
            return last;
        }

        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
