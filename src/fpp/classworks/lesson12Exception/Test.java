package fpp.classworks.lesson12Exception;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        try {
            writeToFile("Hello Darkhan!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
    }

    public static void writeToFile(String str) throws Exception {
        try {
            //throw new Exception("throw!");
            FileWriter fw = new FileWriter("testW.txt");
            fw.write(123);
            fw.write(str);
            fw.close();
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
            throw new Exception(e.getMessage());
        } catch (IOException e) {
            System.out.println("io exception");
        } finally {
            System.out.println("finally will execute anyway");
        }
    }
}
