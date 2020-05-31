package Test1;

public class Solution {
    public static void main(String[] args) {
        String[] array = new String[] {"Hello", "world", null, "array"};
        System.out.println(countOddPositionChars(array));
    }

    public static int countOddPositionChars(String[] array) {
        // WRITE YOUR CODE BELOW THIS LINE
        int summ = 0;
        if (array == null){
            summ = 0;
        }
        else if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null && i % 2 == 0 && i <= array.length) {
                    System.out.println(array[i]);
                    summ = summ + array[i].length();
                }
            }
        }
        return summ;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
