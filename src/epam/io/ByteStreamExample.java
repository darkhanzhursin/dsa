package epam.io;

import java.io.*;

public class ByteStreamExample {

    static String readFirstLineFromFile(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        }
    }

    // copy file
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("path");
             BufferedReader br = new BufferedReader(fr)) {
             br.readLine();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        readFirstLineFromFile("resources/input.txt");
    }
}
