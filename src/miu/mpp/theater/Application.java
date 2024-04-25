package miu.mpp.theater;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Theater theater = new Theater(20, 18, 0.05);
        Scanner scanner = new Scanner(System.in);
        int choice;
        int row = 0;
        int column = 0;
        do {
            System.out.println("1. Show all empty seats");
            System.out.println("2. Show all reserved seats");
            System.out.println("3. Reserve a seat");
            System.out.println("4. Unreserve a seat");
            System.out.println("5. Empty all seats");
            System.out.println("6. Reserve all seats");
            System.out.println("7. Calculate total cost");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    theater.showEmptySeats();
                    break;
                case 2:
                    theater.showReservedSeats();
                    break;
                case 3:
                    System.out.print("Enter row number: ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number: ");
                    column = scanner.nextInt();
                    theater.reserveSeat(row, column);
                    break;
                case 4:
                    System.out.print("Enter row number: ");
                    row = scanner.nextInt();
                    System.out.print("Enter column number: ");
                    column = scanner.nextInt();
                    theater.unreserveSeat(row, column);
                    break;
                case 5:
                    theater.emptyAllSeats();
                    break;
                case 6:
                    theater.reserveAllSeats();
                    break;
                case 7:
                    System.out.print("Enter number of tickets: ");
                    double totalCost = theater.calculateTotalCost(row, column);
                    System.out.println("Total cost of tickets: $" + totalCost);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        } while (choice != 8);

        scanner.close();
    }
}
