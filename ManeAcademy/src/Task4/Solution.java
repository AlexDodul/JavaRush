package Task4;

/*Given an array of integers, return a new array with each value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]

For the beginner, try to use the map method - it comes in very handy quite a lot so is a good one to know.*/

public class Solution {
    public static void main(String[] args) {
        int arrFix[] = new int[] {2, 4, 6, 8, 10};
        int arrDouble[] = map(arrFix);;

        for (int i = 0; i < arrDouble.length; i++){
            System.out.print(arrDouble[i] + " ");
        }
    }
    public static int[] map(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i] * 2;
        }
        return newArr;
    }

}
