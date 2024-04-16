package algos.codesignal.core;

public class Lineup {

    // 0 - facing front
    // 1 - facing left
    // 2 - facing back
    // 3 - facing right
    // a - normal guy
    // b - idiot
    public static void main(String[] args) {
        solution("LLARL");
    }
    static int solution(String commands) {
        int count = 0;
        int a = 0;
        int b = 0;
        for (char c : commands.toCharArray()) {
            if (c == 'A') {
                a += 2;
                b += 2;
            } else if (c == 'L') {
                a += 1;
                b -= 1;
                b += 4;
            } else {
                a -= 1;
                b += 1;
                a += 4;
            }
            a %= 4;
            b %= 4;
            if (a == b) count++;
        }
        return count;
    }
}
