package codesignal.intro;

public class IPv4Address {
    static boolean solution(String inputString) {
        String[] arr = inputString.split("\\.");
        if (arr.length != 4) return false;
        for (int i = 0; i < arr.length; i++) {
            int num;
            try {
               num = Integer.parseInt(arr[i]);
            } catch (NumberFormatException ex) {
                return false;
            }
            if (num > 255 || num < 0) return false;
            if (arr[i].length() > 1 && arr[i].charAt(0) == '0') return false;

        }
        return true;
    }

    public static void main(String[] args) {
        solution(".254.255.0");
    }
}
