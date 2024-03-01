package codesignal.intro;

public class FirstDigit {
    static char solution(String inputString) {
        for (char c: inputString.toCharArray()) {
            if (Character.isDigit(c)) return c;
        }
        return '0';
    }

    public static void main(String[] args) {
        System.out.println(solution("var_1__Int"));
    }
}
