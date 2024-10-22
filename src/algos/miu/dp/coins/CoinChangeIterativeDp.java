package algos.miu.dp.coins;

public class CoinChangeIterativeDp {

    //time: O(amount*n)
    //space: O(amount)
    public int coinChange(int[] coins, int amount) {

        int[] table = new int[amount + 1];
        table[0] = 0;
        for (int i = 1; i <= amount; i++) {
            boolean canBeChanged = false;
            table[i] = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                int smallerAmount = i - coins[j];
                if (smallerAmount >= 0 && table[smallerAmount] != -1) {
                    table[i] = Math.min(table[i], table[smallerAmount] + 1);
                    canBeChanged = true;
                }
            }
            if (!canBeChanged)
                table[i] = -1;
        }
        return table[amount];
    }
}
