package codesignal.intro;

public class AddBorder {

    static String[] solution(String[] picture) {
        String[] ans = new String[picture.length + 2];
        char[] asterisks = new char[picture[0].length()+2];
        for (int i = 0; i < asterisks.length; i++) {
            asterisks[i] = '*';
        }
        for (int i = 0; i < ans.length; i++) {
            if (i == 0 || i == ans.length-1) {
                ans[i] = new String(asterisks);
            }
        }
        for (int j = 0; j < picture.length; j++) {
            ans[j+1] = "*"+picture[j]+"*";
        }

        return ans;
    }

    public static void main(String[] args) {
        solution(new String[] {"abc", "ded"});
    }
}
