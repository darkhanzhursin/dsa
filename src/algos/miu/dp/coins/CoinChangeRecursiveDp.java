package algos.miu.dp.coins;

public class CoinChangeRecursiveDp {

    //time complexity: O(# of self-calls * amount of work in each self-call) = O(amount*n)
    //space complexity: O(amount) + O(amount) = O(amount)
    public int coinChange(int[] coins, int amount) {
        if (amount < 0) return -1;

        int[] table = new int[amount + 1]; // table[i] stores min number of coins to makeup amount i
        for (int i = 0; i <= amount; i++) {
            table[i] = -2;
        }

        return coinChangeDP(table, coins, amount);
    }

    private int coinChangeDP(int[] table, int[] coins, int amount) {

        if (amount < 0) return -1;
        if (table[amount] == -2) {
            if (amount == 0) {
                table[amount] = 0;
            } else {
                int num = Integer.MAX_VALUE;
                boolean canBeChanged = false;
                for (int coin : coins) {
                    int retFromSelfCall = coinChangeDP(table, coins, amount - coin);
                    if (retFromSelfCall != -1) {
                        canBeChanged = true;
                        num = Math.min(num, retFromSelfCall);
                    }
                }
                if (canBeChanged)
                    table[amount] = num + 1;
                else
                    table[amount] = -1;
            }
        }

        return table[amount];
    }

    public static void main(String[] args) {
        CoinChangeRecursiveDp cc = new CoinChangeRecursiveDp();
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(cc.coinChange(coins, amount));
    }
}
