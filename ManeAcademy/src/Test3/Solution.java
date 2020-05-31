package Test3;

public class Solution {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "";
        String s3 = "AAA";
        System.out.println(stringLength(s1));
        System.out.println(stringLength(s2));
        System.out.println(stringLength(s3));
    }
    public static int stringLength(String input) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (input == null){
            return 0;
        }
        else if (input == ""){
            return 0;
        }
        else
        return input.length();
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
