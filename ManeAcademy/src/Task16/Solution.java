package Task16;

/*Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
First argument is an array of numbers and the second is the divisor.

Example
divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[] firstArr = {1,2,3,4,5,6};
        int[] secondArr = {0,1,2,3,4,5,6};
        System.out.println(divisibleBy(firstArr, 2));
        System.out.println(divisibleBy(secondArr, 4));
    }
    public static int[] divisibleBy(int[] numbers, int divider) {
        /*ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0){
                list.add(numbers[i]);
            }
        }
        int[] arrNew = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrNew[i] = list.get(i);
            //System.out.print(arrNew[i] + " ");
        }
        return arrNew;*/


        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0){
                count++;
            }
        }
        int[] arrReturn = new int[count];
        int count2 = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0){
                arrReturn[count2] = numbers[i];
                System.out.print(arrReturn[count2] + " ");
                count2++;
            }
        }
        return arrReturn;
    }
}
