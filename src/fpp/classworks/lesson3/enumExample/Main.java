package fpp.classworks.lesson3.enumExample;

public class Main {

    public static void main(String[] args) {
        for (DaysOfWeek day : DaysOfWeek.values()) {
            System.out.println(day + " " + day.ordinal());
        }

        for (Size size : Size.values()) {
            System.out.println(size);
        }

    }
}
