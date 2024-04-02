package miu.fpp.classworks.lesson5OOP.oop.abstractionVSinheritance;

public class Square extends ClosedCurve implements IClosedCurve {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side * side;
    }
}
