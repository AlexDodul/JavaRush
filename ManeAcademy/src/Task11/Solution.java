package Task11;

/*Simple, remove the spaces from the string, then return the resultant string.*/

public class Solution {
    public static void main(String[] args) {
        String line1 = "8 j 8   mBliB8g  imjB8B8  jl  B";
        String line2 = "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd";
        String line3 = "jfBm  gk lf8hg  88lbe8 ";
        System.out.println(noSpace(line1));
        System.out.println(noSpace(line2));
        System.out.println(noSpace(line3));
    }
    static String noSpace(final String x) {

        return x.replaceAll(" ", "");
    }
}
