package fpp.classworks.lesson5OOP.oop.abstractionVSinheritance;

public class TestAbstract {

    public static void main(String[] args) {
        IClosedCurve[] shapes = {
                new Circle(4.0),
                new Triangle(3.0, 4.0),
                new Square(5.0),
                new Rectangle(2.0, 4.0)
        };

        for (IClosedCurve curve : shapes) {
            double res = curve.computeArea();
            System.out.println(res);
        }
    }
}
