package Task15;

/*Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'*/

public class Solution {
    public static void main(String[] args) {
        String s = "Java is good!";
        System.out.println(solution(s));
    }
    public static String solution(String str) {
        // Your code here...
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
