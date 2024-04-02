package miu.fpp.homeworks.lesson5.prob1;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }
}
