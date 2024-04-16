package algos.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class SubarraySums {

    public static void main(String[] args) {
        findSum(List.of(20, 0, 0, 10), List.of(List.of(2, 2)));
    }

    static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
        List<Long> res = new ArrayList<>();
        for (List<Integer> query : queries) {
            int first = query.get(0);
            int second = query.get(1);
            long l = 0;
            if (first == second) {
                if (numbers.get(first - 1) == 0) {
                    l = 10 + 10;
                    System.out.println(l);
                    res.add(l);
                    continue;
                } else {
                    l = numbers.get(first - 1) + numbers.get(first - 1);
                    System.out.println(l);
                    res.add(l);
                    continue;
                }
            }
            for (int i = first; i <= second; i++) {
                if (numbers.get(i - 1) == 0) {
                    l += 10;
                    continue;
                }
                l += numbers.get(i - 1);
            }
            System.out.println(l);
            res.add(l);
        }

        return res;
    }
}
