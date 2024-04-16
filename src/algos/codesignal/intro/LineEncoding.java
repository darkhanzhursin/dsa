package algos.codesignal.intro;

public class LineEncoding {
    public static void main(String[] args) {
        System.out.println(solution("aabbbcccce"));
    }

    static String solution(String s) {
        StringBuilder encodedString = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is the same as the next one
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++; // If same, increment count
            } else {
                // If different character encountered or end of string reached
                if (count > 1) {
                    // Append count and character to the encoded string
                    encodedString.append(count);
                }
                // Append the character itself
                encodedString.append(s.charAt(i));
                // Reset count for the next character
                count = 1;
            }
        }

        return encodedString.toString();
    }
}
