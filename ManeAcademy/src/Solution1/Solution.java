package Solution1;


public class Solution {
    public static void main(String[] args) {

        String s1 = "4556364607935616";
        String s2 = "64607935616jgk";
        String s3 = "1";
        String s4 = "";
        String s5 = "Nananananananananananananananana Batman!";
        System.out.println(maskify(s1));
        System.out.println(maskify(s2));
        System.out.println(maskify(s3));
        System.out.println(maskify(s4));
        System.out.println(maskify(s5));
    }
    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");

        char[] cr = str.toCharArray();

        if (cr.length < 4) {
            return str;
        } else {

            String[] result = new String[cr.length];
            for (int i = 0; i < result.length - 4; i++) {
                result[i] = "#";
            }
            for (int i = result.length - 4; i < result.length; i++) {
                result[i] = String.valueOf(cr[i]);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < result.length; i++) {
                sb.append(result[i]);
            }
            String line = sb.toString();
            return line;
        }
    }
}
