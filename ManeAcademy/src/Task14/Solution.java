package Task14;

/*Your task is to sum the differences between consecutive pairs in the array in descending order.

For example: sumOfDifferences([2, 1, 10]) Returns 9

Descending order: [10, 2, 1]

Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).*/

public class Solution {
    public static void main(String[] args) {
        int [] arr = {-17, 17};

        System.out.println(sumOfDifferences(arr));

    }

    public static int sumOfDifferences(int[] arr) {
        //your code;
        int diff = 0;
        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int max_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = arr[i];
                arr[i] = arr[max_i];
                arr[max_i] = tmp;
            }
        }
        for (int i = 0; i < arr.length - 1; i++){
            diff = arr[i] - arr[i + 1];
            summ = summ + diff;
        }
        return summ;
    }

}
