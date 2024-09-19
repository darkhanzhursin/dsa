package algos.educative.slidingWindow;

import java.util.*;

public class FindRepeatedSequences {

    public static void main(String[] args) {
        findRepeatedSequences("CGG", 1);
    }

    // Naive approach
    // Time complexity O((n−k)×k)
    // Space complexity O((n−k)×k)
    public static Set<String> findRepeatedSequences(String s, int k) {
        Set<String> storage = new HashSet<>();
        Set<String> result = new HashSet<>();
        if (s.length() < k) return result;
        int start = 0;
        while (true) {
            String str = s.substring(start, start + k);
            if (storage.contains(str)) {
                result.add(str);
            } else {
                storage.add(str);
            }
            if (start + k == s.length()) {
                break;
            }
            start++;
        }

        return result;
    }

    // With hashing
    // Time O((n−k)×k)
    // Space O(n)
    public static Set<String> findRepeatedSequencesWithHash(String s, int k) {

        int n = s.length();

        if (n < k) return new HashSet<>();

        // Mapping of characters
        Map<Character, Integer> mapping = new HashMap<>();
        mapping.put('A', 1);
        mapping.put('C', 2);
        mapping.put('G', 3);
        mapping.put('T', 4);

        // Base value
        int a = 4;

        // Numeric representation of the sequence
        List<Integer> numbers = new ArrayList<>(Arrays.asList(new Integer[n]));
        Arrays.fill(numbers.toArray(), 0);
        for (int i = 0; i < n; i++) {
            numbers.set(i, mapping.get(s.charAt(i)));
        }

        // Current hash value
        int hashValue = 0;

        // 1. Hash set to store the unique hash values
        // 2. Output set to store the repeated substrings
        Set<Integer> hashSet = new HashSet<>();
        Set<String> output = new HashSet<>();

        for (int i = 0; i < n - k + 1; i++) {

            // If the window is at its initial position, calculate the hash value from scratch
            if (i == 0) {
                for (int j = 0; j < k; j++) {
                    hashValue += numbers.get(j) * (int) Math.pow(a, k - j - 1);
                }
            } else {
                int previousHashValue = hashValue;
                hashValue = ((previousHashValue - numbers.get(i - 1) * (int) Math.pow(a, k - 1)) * a) + numbers.get(i + k - 1);
            }

            // If the current hash value is present in the hash set, the current substring has been repeated, so we add it to the output
            if (hashSet.contains(hashValue)) {
                output.add(s.substring(i, i + k));
            }

            // We add the evaluated hash value to the hash set
            hashSet.add(hashValue);
        }
        return output;
    }
}
