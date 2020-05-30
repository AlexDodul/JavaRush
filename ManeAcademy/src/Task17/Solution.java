package Task17;

/*Task
Given three integers a ,b ,c, return the largest number obtained after inserting the following operators and brackets: +, *, ()
In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained
Consider an Example :
With the numbers are 1, 2 and 3 , here are some ways of placing signs and brackets:

1 * (2 + 3) = 5
1 * 2 * 3 = 6
1 + 2 * 3 = 7
(1 + 2) * 3 = 9
So the maximum value that you can obtain is 9.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(2, 1, 2));
        System.out.println(expressionsMatter(1, 1, 1));
        System.out.println(expressionsMatter(2, 1, 1));
        System.out.println(expressionsMatter(1, 2, 3));
        System.out.println(expressionsMatter(1, 3, 1));
        System.out.println(expressionsMatter(2, 2, 2));

        System.out.println(expressionsMatter(5, 1, 3));
        System.out.println(expressionsMatter(3, 5, 7));
        System.out.println(expressionsMatter(5, 6, 1));
        System.out.println(expressionsMatter(1, 6, 1));
        System.out.println(expressionsMatter(2, 6, 1));
        System.out.println(expressionsMatter(2, 10,  3));
    }
    public static int expressionsMatter(int a, int b, int c) {
        // Your Code here... Happy Coding!
        int max = a * b * c;

        if (a + b + c > max){
            max = a + b + c;
        }
        if (a * b + c > max){
            max = a * b + c;
        }
        if (a + b * c > max){
            max = a + b * c;
        }
        if ((a + b) * c > max){
            max = (a + b) * c;
        }
        if (a * (b + c) > max){
            max = a * (b + c);
        }
        return max;
    }
}
