package fpp.classworks.lesson5OOP.oop.abstractionVSinheritance;

public class Circle extends ClosedCurve implements IClosedCurve {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }


}
