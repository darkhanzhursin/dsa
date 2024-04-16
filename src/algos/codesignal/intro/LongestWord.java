package algos.codesignal.intro;

public class LongestWord {

    static String solution(String text) {
        String s[] = text.split(" |,|!|\\.|\\[|\\(");
        String max = "";
        for (String str : s) {
           if (str.length() > max.length()) max = str;
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        solution("Ready(((, steady, go!");
    }
}
