package algos.codesignal.intro;

public class DeleteDigit {
    public static void main(String[] args) {
        System.out.println(solution(152));
    }

    static int solution(int n) {
        String before = Integer.toString(n);
        StringBuilder sb = new StringBuilder(before);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < before.length(); i++) {
            String s = sb.deleteCharAt(i).toString();
            int num = Integer.parseInt(s);
            if (num > max) {
                max = num;
            }
            sb = new StringBuilder(before);
        }
        return max;
    }
}
