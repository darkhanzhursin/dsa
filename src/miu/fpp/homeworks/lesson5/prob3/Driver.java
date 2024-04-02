package miu.fpp.homeworks.lesson5.prob3;

public class Driver {

    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };

        for (Figure f : figures) {
            f.getFigure();
        }

        for (Figure f : figures) {
            String[] names = f.getClass().getName().split("\\.");
            String name = names[names.length - 1];
            System.out.print(name + " : ");
            f.getFigure();
        }
    }
}
