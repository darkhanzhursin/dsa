package algos.miu.lab9;

public class CoinChangeDpRec {
    private Integer[] table;

    public int coinChange(int[] coins, int amount) {
        table = new Integer[amount + 1];
        return recursionHelper(coins, amount);
    }

    private int recursionHelper(int[] coins, int remain) {
        if (remain < 0) return -1;
        if (remain == 0) return 0;

        if (table[remain] != null) return table[remain];

        int minCount = Integer.MAX_VALUE;
        for (int coin : coins) {
            int count = recursionHelper(coins, remain - coin);
            if (count == -1) continue;
            minCount = Math.min(minCount, count + 1);
        }

        table[remain] = minCount == Integer.MAX_VALUE ? -1 : minCount;
        return table[remain];
    }
}
