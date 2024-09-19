package algos.hackerRank;

import java.util.*;

class Result {

    /**
     * Complete the 'getNumTeams' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY skill
     *  2. INTEGER min_skill
     *  3. INTEGER max_skill
     */
    public static long getNumTeams(List<Integer> skill, int min_skill, int max_skill) {
        // Check if the input list is empty
        if (skill == null || skill.isEmpty() || skill.size() > 100000) {
            return 0;
        }


        // Convert the List to an array for easier manipulation
        int[] skills = skill.stream().mapToInt(i -> i).toArray();
        // Sort the skill array
        Arrays.sort(skills);
        int n = skills.length;
        long count = 0;

        // Use two pointers to find pairs
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = skills[left] + skills[right];
            if (sum < min_skill) {
                left++;
            } else if (sum > max_skill) {
                right--;
            } else {
                // If a valid pair is found, count all pairs between left and right
                count += (right - left);

                left++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> skill = Arrays.asList(2, 3, 4, 5);
        int min_skill = 5;
        int max_skill = 7;
        System.out.println(getNumTeams(skill, min_skill, max_skill)); // Expected output: 3
    }
}
