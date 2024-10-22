package algos.miu.lab9;

public class RecursiveDpFib {
    int[] table;
    public int fib(int n) {
        if(n < 0) return -1;
        table = new int[n+1];
        for(int i = 0; i <= n; ++i) {
            table[i] = -1;
        }
        return recDpFib(n);
    }
    private int recDpFib(int n) {
        if(table[n] < 0) {
            System.out.println("entering fib with n=" + n);
            if(n == 0 || n == 1)
                table[n] = n;
            else
                table[n] = recDpFib(n-1) + recDpFib(n-2);
        }
        return table[n];
    }

    public static void main(String[] args) {
        RecursiveDpFib f = new RecursiveDpFib();
        System.out.println(f.fib(5));
    }
}
