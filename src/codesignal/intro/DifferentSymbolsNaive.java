package codesignal.intro;

import java.util.ArrayList;
import java.util.List;

public class DifferentSymbolsNaive {
    static int solution(String s) {
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }

        return list.size();
    }

    public static void main(String[] args) {
        System.out.println(solution("cabca"));
    }
}
