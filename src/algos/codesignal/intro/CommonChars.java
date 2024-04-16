package algos.codesignal.intro;

public class CommonChars {
    static int solution(String s1, String s2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count the occurrences of each character in the first string
        for (char c : s1.toCharArray()) {
            int i = c - 'a';
            count1[i]++;
        }

        // Count the occurrences of each character in the second string
        for (char c : s2.toCharArray()) {
            int i = c - 'a';
            count2[i]++;
        }

        int commonCount = 0;

        // Iterate over the counts and find the common characters
        for (int i = 0; i < 26; i++) {
            commonCount += Math.min(count1[i], count2[i]);
        }

        return commonCount;
    }

    public static void main(String[] args) {
        solution("aabcc", "adcaa");
    }
}
