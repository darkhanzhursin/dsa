package fpp.homeworks.lesson5.prob5;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell", "Intel i5", 8, 3.2);
        Computer computer2 = new Computer("HP", "AMD Ryzen", 16, 3.8);
        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer1.equals(computer2));
        System.out.println(computer1.hashCode());
        System.out.println(computer2.hashCode());
        Computer computer3 = computer1;
        System.out.println(computer3.equals(computer1));
    }
}
