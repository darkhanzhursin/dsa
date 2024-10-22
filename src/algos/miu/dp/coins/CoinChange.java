package algos.miu.dp.coins;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        int num = Integer.MAX_VALUE;
        boolean canBeChanged = false;

        for (int coin : coins) {
            int retFromSelfCall = coinChange(coins, amount - coin);
            if (retFromSelfCall != -1) {
                canBeChanged = true;
                num = Math.min(num, retFromSelfCall);
            }
        }

        if (canBeChanged) {
            return num + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        int res = coinChange.coinChange(new int[]{1, 2, 5}, 11);
        System.out.println(res);
    }
}
