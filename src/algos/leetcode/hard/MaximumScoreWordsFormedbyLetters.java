package algos.leetcode.hard;

public class MaximumScoreWordsFormedbyLetters {

    public static void main(String[] args) {
        maxScoreWords(new String[] {"dog","cat","dad","good"},
                new char[] {'a','a','c','d','d','d','g','o','o'},
                new int[] {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0});
    }

    static int maxScoreWords(String[] words, char[] letters, int[] score) {
        int res = 0;
        int[] count = new int[26];
        int[] lettersCount = new int[26];

        for (char c : letters) {
            count[c - 'a']++;
        }

        res = backtracking(words, score, count, lettersCount, 0, 0, res);

        return res;
    }

    private static int backtracking(String[] words, int[] score, int[] count,
                             int[] lettersCount, int pos, int temp, int ans) {

        for (int i = 0; i < 26; i++) {
            if (lettersCount[i] > count[i]) return ans;
        }

        ans = Math.max(ans, temp);

        for (int i = pos; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                lettersCount[c - 'a']++;
                temp += score[c - 'a'];
            }

            ans = backtracking(words, score, count, lettersCount, i + 1, temp, ans);

            for (char c : words[i].toCharArray()) {
                lettersCount[c - 'a']--;
                temp -= score[c - 'a'];
            }
        }

        return ans;
    }
}
