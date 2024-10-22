package algos.miu.lab9;

public class IterativeDpFib {
    public static void main(String[] args) {
        IterativeDpFib f = new IterativeDpFib();
        System.out.println(f.fib(50));

    }

    int fib(int n) {
        int[] table = new int[n+1];
        table[0] = 0;
        table[1] = 1;
        for(int i = 2; i <= n; i++) {
            table[i] = table[i-1] + table[i-2];
        }
        return table[n];
    }
}
