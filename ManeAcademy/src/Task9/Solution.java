package Task9;

import com.sun.deploy.security.BadCertificateDialog;

/*Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

Patrick Feeney => P.F*/

public class Solution {
    public static void main(String[] args) {
        String name1 = "Sam Harris";
        String name2 = "Patrick Feenan";
        String name3 = "Evan Cole";
        String name4 = "P Favuzzi";
        String name5 = "David Mendieta";

        System.out.println(abbrevName(name1));
        System.out.println(abbrevName(name2));
        System.out.println(abbrevName(name3));
        System.out.println(abbrevName(name4));
        System.out.println(abbrevName(name5));


    }

    public static String abbrevName(String name) {
        String[] nameParts = name.split(" ");
        char firstInitial = nameParts[0].charAt(0);
        char secondInitial = nameParts[1].charAt(0);

        String nameInitial = firstInitial + "." + secondInitial;

        return nameInitial;
    }
}
