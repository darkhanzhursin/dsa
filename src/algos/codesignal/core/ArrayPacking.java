package algos.codesignal.core;

public class ArrayPacking {

    public static void main(String[] args) {
        solution(new int[] {24, 85, 0});
    }

    static int solution(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            if (i == 0) continue;
            String bin = Integer.toBinaryString(i);
            String completed = complete(bin);
            sb.insert(0, completed);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    private static String complete(String s) {
        while (s.length() < 8) {
            String temp = s;
            s = "0" + temp;
        }
        return s;
    }
}
