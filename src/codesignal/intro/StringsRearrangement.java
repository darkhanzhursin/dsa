package codesignal.intro;

public class StringsRearrangement {
    static boolean solution(String[] inputArray) {
        boolean res = doPermutation(inputArray, 0);
        return res;
    }

    private static boolean doPermutation(String[] strings, int index) {
        if (index == strings.length - 1) {
            return isValid(strings);
        }

        for (int i = index; i < strings.length; i++) {
            if (i != index) {
                swap(strings, index, i);
            }

            if (doPermutation(strings, index + 1)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValid(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (!differByOneCharacter(arr[i - 1], arr[i])) {
                return false;
            }
        }
        return true;
    }

    private static boolean differByOneCharacter(String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return count == 1;
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"aba", "bbb", "bab"}));
        System.out.println(solution(new String[] {"bb", "aa", "ab"}));
    }
}
