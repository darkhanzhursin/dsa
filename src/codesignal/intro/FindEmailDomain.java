package codesignal.intro;

public class FindEmailDomain {
    static String solution(String address) {
        String[] parts = address.split("@");
        return parts[parts.length - 1];
    }

    public static void main(String[] args) {
        solution("\"very.(),:;<>[]\\\".VERY.\\\"very@\\\\ \\\"very\\\".unusual\"@strange.example.com");
    }
}
