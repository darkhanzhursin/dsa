package algos.codesignal.intro;

public class PhoneCall {

    static int solution(int min1, int min2_10, int min11, int s) {
        int timer = 0;
        while (s > 0) {
            if (timer < 1 && s >= min1) { s -= min1; }
            else if (timer >= 1 && timer < 10 && s >= min2_10) {
                s -= min2_10;
            }
            else if (timer >= 10 && s >= min11) { s -= min11; }
            else break;
            timer++;
        }
        return timer;
    }

    public static void main(String[] args) {
        int res = solution(10, 1, 2, 22);
        System.out.println(res);
    }
}
