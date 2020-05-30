package Task20;

public class Solution {
    public static void main(String[] args) {
        String s1 = "Robin Singh";
        String[] arr = stringToArray(s1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static String[] stringToArray(String s) {
        //your code;
        return s.split(" ");
    }
}
