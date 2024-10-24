package algos.miu.lab9;

public class CoinChangeRec {

    public static int coinChange(int[] coins, int amount) {
        return recursionHelper(coins, amount);
    }

    private static int recursionHelper(int[] coins, int remain) {
        if (remain < 0) return -1;
        if (remain == 0) return 0;

        int minCount = Integer.MAX_VALUE;
        for (int coin : coins) {
            int count = recursionHelper(coins, remain - coin);
            if (count == -1) continue;
            minCount = Math.min(minCount, count + 1);
        }

        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }

    public static void main(String[] args) {
        int res = coinChange(new int[] {1, 2, 5}, 11);
        System.out.println(res);
    }
}
