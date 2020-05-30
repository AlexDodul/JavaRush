package Task10;

/*Return the Nth Even Number

nthEven(1) //=> 0, the first even number is 0
nthEven(3) //=> 4, the 3rd even number is 4 (0, 2, 4)

nthEven(100) //=> 198
nthEven(1298734) //=> 2597466
The input will not be 0.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(nthEven(1298734));

    }

    public static int nthEven(int n) {
        // write your code here
        int count = 1;
        int number = 0;
        while (n != count){
            number = number + 2;
            count++;
        }
        return number;
    }
}
