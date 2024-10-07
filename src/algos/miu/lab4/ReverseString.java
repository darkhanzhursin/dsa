package algos.miu.lab4;
// we test coders
// ew tset sredoc
public class ReverseString {
    public String reverseString(String input) {
        StringBuilder result = new StringBuilder();
        int start = 0;

        for (int i = 0; i < input.length(); i++) {
            // If we encounter a space, reverse the current word
            if (input.charAt(i) == ' ') {
                result.append(strRev(input, start, i - 1)); // Reverse word from start to i-1
                result.append(' ');
                start = i + 1;
            }
        }

        // Reverse the last word (as there might not be a trailing space)
        result.append(strRev(input, start, input.length() - 1));

        return result.toString();
    }

    // Helper method to reverse a word in the string from indices start to end
    private String strRev(String s, int start, int end) {
        StringBuilder word = new StringBuilder();
        for (int i = end; i >= start; i--) {
            word.append(s.charAt(i));
        }
        return word.toString();
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverseString("We test coders"));
    }
}
