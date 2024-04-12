package miu.mpp.lab7.regex.examples;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ch9PMCountJava {
    public static void main(String[] args) {
        String document;
        int javaCount = 0;
        Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
        document = JOptionPane.showInputDialog(null, "Sentence: ");
        Matcher matcher = pattern.matcher(document);
        while (matcher.find()) javaCount++;
        JOptionPane.showMessageDialog(null, "The word 'java' occurred " + javaCount + " times.");
    }
}
