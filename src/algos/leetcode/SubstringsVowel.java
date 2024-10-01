package algos.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubstringsVowel {
    public static void main(String[] args) {
        countOfSubstrings("ieaouqqieaouqq", 1);
    }

    public static int countOfSubstrings(String word, int k) {
        int totalCount = 0;
        int n = word.length();

        // Iterate through all possible starting points of substrings
        for (int start = 0; start < n; start++) {
            Set<Character> vowelsFound = new HashSet<>();
            int consonantCount = 0;

            // Iterate through the substring starting from 'start'
            for (int end = start; end < n; end++) {
                char currentChar = word.charAt(end);

                // If the character is a vowel, add it to the set of vowels found
                if (isVowel(currentChar)) {
                    vowelsFound.add(currentChar);
                }
                // If it's a consonant, increase the consonant count
                else if (Character.isLetter(currentChar)) {
                    consonantCount++;
                }

                // Check if the substring contains all vowels and exactly k consonants
                if (vowelsFound.size() == 5 && consonantCount == k) {
                    totalCount++;
                }

                // If consonant count exceeds k, break as no valid substrings can follow
                if (consonantCount > k) {
                    break;
                }
            }
        }

        return totalCount;
    }

    // Check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
