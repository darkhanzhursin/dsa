package miu.mpp.lab7.regex.examples;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch9PMCountJava2 {

    public static void main(String[] args) {
        String document;
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        document = JOptionPane.showInputDialog(null, "Sentence: ");
        Matcher matcher = pattern.matcher(document);
        while (matcher.find()) {
            System.out.println(document.substring(matcher.start(), matcher.end()) + " found at position " + matcher.start());
        }
    }
}
