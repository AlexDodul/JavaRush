package Test2;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1};
        int[] arr2 = {-1, -4, -3, -2};
        int[] arr3 = {};
        int[] arr4 = null;
        System.out.println(findSmallestElement(arr1));
        System.out.println(findSmallestElement(arr2));
        System.out.println(findSmallestElement(arr3));
        System.out.println(findSmallestElement(arr4));

    }
    public static int findSmallestElement(int[] nums) {
        // WRITE YOUR CODE BELOW THIS LINE
        int min;
        if (nums == null){
            min = 0;
        }
        else if (nums.length == 0){
            min = 0;
        }
        else {
            min = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (min > nums[i]) {
                    min = nums[i];
                }
            }
        }
        return min;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
