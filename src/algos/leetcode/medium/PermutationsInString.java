package algos.leetcode.medium;

public class PermutationsInString {

    public static void main(String[] args) {
        checkInclusion("ab", "eidboaoo");
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];

        for (char c : s1.toCharArray()) {
            map[c - 'a']++;
        }

        int i = 0, j = 0;

        int count_chars = s1.length();

        while (j < s2.length()) {
            //if after decrementing char at j index in s2 is still greater than 0 means we have found 1 char
            char l = s2.charAt(j);
            if(map[l - 'a'] > 0){
                count_chars--;//decrease the count of chars we need to find
            }
            map[l - 'a']--;
            j++;

            if(count_chars == 0){// we have found all the chars
                return true;
            }
            //shifting of the window. Here we need to do 2 things
            // j- i = s1.length then we have to remove what is present at i'th index in s2
            //2: increase the count of s2.charAt(i) because we have to find it again as it was removed
            if(j - i == s1.length() && map[s2.charAt(i++) - 'a']++ >= 0){
                count_chars++;
            }
        }
        return false;
    }
}
