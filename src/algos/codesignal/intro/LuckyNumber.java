package algos.codesignal.intro;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {

    static boolean solution(int n) {
        List<Integer> integers = new ArrayList<>();
        while (n > 0) {
            integers.add(n % 10);
            n /= 10;
        }

        if (integers.size() % 2 != 0) return false;
        int part1 = 0;
        int part2 = 0;
        for (int i = 0; i < integers.size()/2; i++) {
            part1 += integers.get(i);
        }

        for (int i = integers.size()-1; i >= integers.size()/2; i--) {
            part2 += integers.get(i);
        }

        if (part1 == part2) return true;
        return false;
    }

    public static void main(String[] args) {
        solution(1230);
    }
}
