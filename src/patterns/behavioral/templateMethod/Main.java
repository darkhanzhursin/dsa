package patterns.behavioral.templateMethod;

/*
- turns an algorithm int a series of individual methods
- keeps the structure of your base algorithm intact
- eliminates code duplication by pulling up the steps with similar implementations into the superclass housing the
template method
- the code that varies is split between different implementations
* */
public class Main {
    public static void main(String[] args) {
        BaseGameLoader gtaLoader = new GtaLoader();
        gtaLoader.load();

        System.out.println("==========================================");

        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();
    }
}
