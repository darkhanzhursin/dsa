package fpp.homeworks.lesson5.prob1;

public class Main {
    public static void printTotal(Shape[] shapes) {
        double totalArea = 0.0;
        double totalPerimeter = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
            totalPerimeter += shape.calculatePerimeter();
        }
        System.out.println(totalArea);
        System.out.println(totalPerimeter);
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Rectangle rectangle1 = new Rectangle("black", 4, 8);
        Square square1 = new Square("white", 2);
        Circle circle = new Circle("green", 10);
        Rectangle rectangle2 = new Rectangle(6, 9);
        Rectangle square2 = new Square("yellow2", 7);
        shapes[0] = rectangle1;
        shapes[1] = square1;
        shapes[2] = circle;
        shapes[3] = rectangle2;
        shapes[4] = square2;
        printTotal(shapes);
    }
}
