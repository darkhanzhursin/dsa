package codesignal.intro;

public class ElectionWinners {
    static int solution(int[] votes, int k) {
        int maxPos = -1;
        int max = Integer.MIN_VALUE;
        int winners = 0;
        int numCandidates = votes.length;

        for (int pos = 0; pos < numCandidates; pos++) {
            if (votes[pos] > max) {
                maxPos = pos;
                max = votes[pos];
                winners = 1;
            } else if (votes[pos] == max) {
                winners++;
            }
        }

        if (k == 0 && winners > 1) return 0;
        if (k == 0) return 1;
        winners = 0;
        for (int vote : votes) {
            if (vote + k > max) {
                winners++;
            }
        }

        return winners;
    }


    public static void main(String[] args) {
        int res = solution(new int[] {1, 2, 3, 2}, 0);
        System.out.println(res);
    }
}
