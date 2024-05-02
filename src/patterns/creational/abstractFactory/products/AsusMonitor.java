package patterns.creational.abstractFactory.products;

public class AsusMonitor implements Monitor {

    @Override
    public void assemble() {
        // Logic relevant to ASUS GPUs
        System.out.println("Assembling ASUS Monitor");
    }
}
