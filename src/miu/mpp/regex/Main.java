package miu.mpp.regex;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "Hello, World!";
        String pattern1 = "Hello";
        boolean isMatch1 = Pattern.matches(pattern1, text);
        System.out.println("Is there a match? " + isMatch1);

        String phoneNumber = "123-456-7890";
        String pattern2 = "\\d{3}-\\d{3}-\\d{4}";
        boolean isMatch2 = Pattern.matches(pattern2, phoneNumber);
        System.out.println("Is it a valid phone number? " + isMatch2);
    }
}
