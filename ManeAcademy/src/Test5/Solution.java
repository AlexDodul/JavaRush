package Test5;

public class Solution {
    public static void main(String[] args) {
        System.out.println(hasNoneLetters("55khyg", "null"));

    }
    public static boolean hasNoneLetters(String blacklist, String phrase) {
        // WRITE YOUR CODE BELOW THIS LINE

        if (blacklist == null){
            return true;
        }
        else if (phrase == null){
            return true;
        }
        else {
            char[] black = blacklist.toCharArray();
            char[] phraseChar = phrase.toCharArray();
            int count = 0;
            for (int i = 0; i < black.length; i++) {
                for (int j = 0; j < phraseChar.length; j++) {
                    String charWord1 = String.valueOf(black[i]);
                    String charWord2 = String.valueOf(phraseChar[j]);
                    if (charWord1.equalsIgnoreCase(charWord2)){
                        count++;
                    }
                }
            }
            System.out.println(count);
            if (count != 0){
                return false;
            }
            else {
                return true;
            }
        }
        // WRITE YOUR CODE ABOVE THIS LINE
    }
}
