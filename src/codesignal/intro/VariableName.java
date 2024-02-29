package codesignal.intro;

public class VariableName {

    boolean solution(String name) {

        // Check if the string is empty or starts with a digit
        if (name.isEmpty() || Character.isDigit(name.charAt(0))) {
            return false;
        }

        // Check each character of the string
        for (char c : name.toCharArray()) {
            // If the character is not a letter, digit, or underscore, return false
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }

        // All characters meet the criteria, so return true
        return true;
    }

}
