package miu.fpp.homeworks.lesson3.problem3;

import java.util.Scanner;

public class Main {
     static Scanner scanner = new Scanner(System.in);

    private static void start() {
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String figure = scanner.nextLine();
        calculateArea(figure);
    }
    public static void main(String[] args) {
        start();
    }

    private static void calculateArea(String figure) {
        switch (figure) {
            case "C" -> {
                System.out.println("Enter the radius of the Circle");
                String radius = scanner.nextLine();
                Circle circle = new Circle(Double.parseDouble(radius));
                System.out.println("The area of Circle is: " + circle.computeArea());
            }
            case "R" -> {
                System.out.println("Enter the width of the Rectangle");
                String width = scanner.nextLine();
                System.out.println("Enter the height of the Rectangle");
                String height = scanner.nextLine();
                Rectangle rectangle = new Rectangle(Double.parseDouble(width), Double.parseDouble(height));
                System.out.println("The area of Rectangle is: " + rectangle.computeArea());
            }
            case "T" -> {
                System.out.println("Enter the base of the Triangle");
                String base = scanner.nextLine();
                System.out.println("Enter the height of the Triangle");
                String height = scanner.nextLine();
                Triangle triangle = new Triangle(Double.parseDouble(base), Double.parseDouble(height));
                System.out.println("The area of Rectangle is: " + triangle.computeArea());
            }
            default -> {
                System.out.println("You entered wrong sign! Please, try again.");
                start();
            }
        }
    }
}
