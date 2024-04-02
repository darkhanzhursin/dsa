package codesignal.core;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SquareDigitsSequence {
    public static void main(String[] args) {
        System.out.println(solution(16));
    }
    static int solution(int a0) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        map.put(a0, count);
        int result = 0;
        boolean isContainsDuplicate = false;
        while (!isContainsDuplicate) {
            while(a0 > 0) {
                int k = a0 % 10;
                result += k * k;
                a0 /= 10;
            }
            a0 = result;
            if (map.containsKey(result)) {
                isContainsDuplicate = true;
            }
            map.put(result, count);
            result = 0;
        }
        return map.size() + 1;
    }

}
