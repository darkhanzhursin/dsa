package codesignal.intro;

import java.util.Arrays;

public class BeautifulString {
    public static void main(String[] args) {
        System.out.println(isBeautiful("aabbb"));
    }
    static boolean isBeautiful(String inputString) {
        int[] frequency = new int[26]; // Array to store the frequency of each letter
        char[] chars =  inputString.toCharArray();
        Arrays.sort(chars);
        // Iterate through the characters of the string
        for (char ch : chars) {
            int index = ch - 'a'; // Calculate the index of the character in the frequency array
            frequency[index]++;
            // Check if the frequency of the current letter is greater than the frequency of the previous letter
            if (index > 0 && frequency[index] > frequency[index - 1]) {
                return false; // If yes, the string is not beautiful
            }
        }

        return true; // If no letter appears more times than its previous letter, the string is beautiful
    }
}
