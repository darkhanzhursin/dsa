package fpp.classworks.lesson5.oop.abstractionVSinheritance;

public class Rectangle extends ClosedCurve implements IClosedCurve {
    private double width;
    private double length;
    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double computeArea() {
        return width * length;
    }
}
