package Task8;

/*Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.

If the input array is empty or null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].*/

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        int[] arrNew = countPositivesSumNegatives(arr);
        for (int i = 0; i < 2; i++) {
            System.out.println(arrNew[i]);
        }

    }

    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int summ = 0;

        for (int i = 0; i < input.length; i++){
            if (input[i] > 0){
                count++;
            }
            else if (input[i] < 0){
                summ = summ + input[i];
            }
        }
        int[] arrNew = new int[] {count, summ};
        return arrNew; //return an array with count of positives and sum of negatives
    }
}
