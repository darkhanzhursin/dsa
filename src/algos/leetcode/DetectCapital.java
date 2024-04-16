package algos.leetcode;

/*
All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "algos.leetcode".
Only the first letter in this word is capital, like "Google".
*/
public class DetectCapital {

    public static boolean detectCapitalUse(String word) {
//        if (word == null || word.isEmpty()) return false;
//        return word.matches("^[A-Z]+$") || word.matches("^[a-z]+$") || word.matches("^[A-Z][a-z]*$");
//        return word.matches("[A-Z]*|[a-z]*|[A-Z][a-z]*");

        int n = word.length();

        // Check if all letters are capitals
        boolean allCapitals = true;
        for (int i = 0; i < n; i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                allCapitals = false;
                break;
            }
        }
        if (allCapitals) return true;

        // Check if all letters are lowercase
        boolean allLowercase = true;
        for (int i = 0; i < n; i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                allLowercase = false;
                break;
            }
        }
        if (allLowercase) return true;

        // Check if only the first letter is capital
        return Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase());
    }

    public static void main(String[] args) {
        detectCapitalUse("USA");
    }
}
