package Task7;

/*For every good kata idea there seem to be quite a few bad ones!

In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'.
If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'.
If there are no good ideas, as is often the case, return 'Fail!'.*/

public class Solution {
    public static void main(String[] args) {
        String[] arrWell1 = new String[] {"bad", "bad", "bad"};
        String[] arrWell2 = new String[] {"good", "bad", "bad", "bad", "bad"};
        String[] arrWell3 = new String[] {"good", "bad", "bad", "bad", "bad", "good", "bad", "bad", "good"};

        System.out.println(well(arrWell1));
        System.out.println(well(arrWell2));
        System.out.println(well(arrWell3));
    }

    public static String well(String[] x) {
        // TODO
        int count = 0;
        String s;
        for (int i = 0; i < x.length; i++){
            if (x[i].equals("good")){
                count++;
            }
        }
        if (count == 1){
            s = "Publish!";
        }
        else if (count > 1){
            s = "I smell a series!";
        }
        else {
            s = "Fail!";
        }
        return s;
    }
}
