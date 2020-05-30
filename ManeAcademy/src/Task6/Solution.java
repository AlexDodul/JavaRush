package Task6;

/*Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.*/

public class Solution {
    public static void main(String[] args) {
        int arrFix[] = new int[] {200, 40, -600, 80, 10, 0};
        System.out.println(findSmallestInt(arrFix));
    }

    public static int findSmallestInt(int[] args) {
        int number = args[0];
        for (int i = 0; i < args.length; i++){
            if (number > args[i]){
                number = args[i];
            }
        }
        return number;
    }
}
