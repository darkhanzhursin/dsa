package algos.codesignal.core;

public class AdditionWithoutCarrying {
    public static void main(String[] args) {
        System.out.println(solution(456, 1734));
        System.out.println(solution2(456, 1734));
    }

    static int solution2(int param1, int param2) {
        if (param1 == 0 || param2 == 0) {
            return param1 + param2;
        }
        return solution2(param1 / 10, param2 / 10) * 10 + (param1 + param2) % 10;
    }

    static int solution(int param1, int param2) {
        String[] numbers = equalize(param1, param2);
        char[] num1 = numbers[0].toCharArray();
        char[] num2 = numbers[1].toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = num1.length - 1; i >= 0; i--) {
            int f = Character.getNumericValue(num1[i]);
            int s = Character.getNumericValue(num2[i]);
            String output = Integer.toString(f + s);
            sb.insert(0, output.charAt(output.length() - 1));
        }

        return Integer.parseInt(sb.toString());
    }

    private static String[] equalize(int num1, int num2) {
        String[] res = new String[2];
        String n1 = Integer.toString(num1); //456
        String n2 = Integer.toString(num2); //1734
        if (n1.length() == n2.length()) return new String[]{n1, n2};
        int max = Math.max(n1.length(), n2.length());
        StringBuilder sb = null;
        if (n1.length() > n2.length()) {
            sb = new StringBuilder(n2);
            while (sb.length() < max) {
                sb.insert(0, "0");
            }
            res[0] = n1;
            res[1] = sb.toString();
        } else {
            sb = new StringBuilder(n1);
            while (sb.length() < max) {
                sb.insert(0, "0");
            }
            res[0] = sb.toString();
            res[1] = n2;
        }

        return res;
    }
}
