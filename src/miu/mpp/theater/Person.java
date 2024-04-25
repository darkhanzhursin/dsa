package miu.mpp.theater;

import java.util.Scanner;

public class Person {

    private String name;
    private Theater theater;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public String getName() {
        return name;
    }

    public Theater getTheater() {
        return theater;
    }

    void reserve() throws NoAvailableSeatsException {
        if (theater.getEmptySpaces() == 0) {
            throw new NoAvailableSeatsException("Sorry, there is now free seat left.");
        }
        System.out.println("Available seats: ");
        theater.showAllEmptySeats();
        try (Scanner scanner = new Scanner(System.in)) {
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            System.out.println(row + col);
        }

    }
    void pay() {}

    void unreserve() {}
}
