package algos.codesignal.intro;

public class DepositProfit {
    static int solution(int deposit, int rate, int threshold) {
        int years = 0;

        double balance = deposit;
        while (balance < threshold) {
            balance += balance * (rate / 100.0);
            years++;
        }
        return years;
    }


    public static void main(String[] args) {
        solution(100, 20, 170);
    }
}
