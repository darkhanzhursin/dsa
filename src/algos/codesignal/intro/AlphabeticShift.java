package algos.codesignal.intro;

public class AlphabeticShift {

    static String solution(String inputString) {
        String s = "";
        for (char c : inputString.toCharArray()) {
            char n;
            if (c == 'z') {
                n = 'a';
            } else {
                n = ++c;
            }
            s = s + n;
        }

        return s;
    }

    public static void main(String[] args) {
        solution("crazy");
    }

}
