package miu.mpp.lab7.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLab {

    // license plate number whose format is two letters followed by four digits followed by three letters
    static boolean isLicensePlate(String str) {
        String pattern = "[a-zA-Z]{2}\\d{4}[a-zA-Z]{3}";
        return str.matches(pattern);
    }

    static boolean isLicensePlatePM(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{2}\\d{4}[a-zA-Z]{3}");
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // Replace every occurrence of  8  with  ‘eight’.
    static String replace8WithEight(String str) {
        // String pattern = "[8]";
        return str.replaceAll("8", "eight");
    }

    public static boolean myMatches(String regex, CharSequence input) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }

    public String myReplaceAll(String regex, String replacement) {
        return Pattern.compile(regex).matcher(new String("")).replaceAll(replacement);
    }

    public static String myReplaceAll(String original, String regex, String replacement) {
        if (original == null || regex == null || replacement == null) {
            throw new IllegalArgumentException("Input strings cannot be null");
        }

        return original.replaceAll(regex, replacement);
    }
    public static void main(String[] args) {
        String example1 = "az1234azE";
        System.out.println(isLicensePlate(example1));
        System.out.println(replace8WithEight("there are 8 men with 8 guns with 888 number on them."));
        System.out.println(isLicensePlatePM(example1));
    }
}
