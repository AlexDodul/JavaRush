package Task5;

/*Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []*/

public class Solution {
    public static void main(String[] args) {
        int arrFix[] = new int[] {2, -4, 6, -8, 10};
        int arrDouble[] = invert(arrFix);

        for (int i = 0; i < arrDouble.length; i++){
            System.out.print(arrDouble[i] + " ");
        }
    }

    public static int[] invert(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++){
            newArr[i] = array[i] * (-1);
        }
        return newArr;
    }
}
