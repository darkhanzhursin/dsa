package miu.mpp.lab3;

import miu.mpp.lab3.customer.ACustomer;
import miu.mpp.lab3.customer.Person;
import miu.mpp.lab3.customer.Senior;
import miu.mpp.lab3.customer.Student;
import miu.mpp.lab3.post.FedEx;
import miu.mpp.lab3.post.UPS;
import miu.mpp.lab3.post.USMail;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PostApp {

    public static void main(String[] args) throws IOException {

        Map<String, Map<Double, String>> result = new HashMap<>();
        while (true) {
            putText("Please, enter number of packages: ");
            int packages = getInt();
            processPackages(packages, result);
            putText("Enter q to exit: ");
            char exit = getChar();
            if (exit == 'q') return;
        }

    }

    private static void processPackages(int packages, Map<String, Map<Double, String>> result) throws IOException {
        for (int i = 0; i < packages; i++) {
            int n = i + 1;
            putText("Enter description for package " + n + ": ");
            String desc = getString();
            putText("Enter the weight: ");
            double weight = Double.parseDouble(getString());
            putText("Please, enter zone: ");
            String zone = getString();
            ACustomer aCustomer = getCustomer();
            List<IService> postServices = List.of(new FedEx(weight, desc, zone, aCustomer),
                    new UPS(weight, desc, aCustomer),
                    new USMail(weight, desc, aCustomer));
            double lowest = postServices.stream().map(IService::getPrice).min(Double::compare).orElse(Double.MAX_VALUE);
            String name = postServices.stream().filter(s -> s.getPrice() == lowest).findFirst().orElseThrow().toString();
            result.put(desc, Map.of(lowest, name));
        }

        for (Map.Entry<String, Map<Double, String>> entry : result.entrySet()) {
            String desc = entry.getKey();
            entry.getValue().forEach((key, value) -> System.out.println(desc + "\t $" + key + "\t" + value));
        }
    }

    private static ACustomer getCustomer() throws IOException {
        putText("Enter your name: ");
        String name = getString();
        putText("Enter your age: ");
        int age = getInt();
        if (age >= 65) return new Senior(name, age);
        putText("Are you student? Y or N");
        char ans = getChar();
        if(ans == 'y' || ans == 'Y') return new Student(name, age);
        return new Person(name, age);
    }

    public static void putText(String s) {
        System.out.println(s);
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }

    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

}
