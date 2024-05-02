package patterns.creational.abstractFactory.products;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        // Logic relevant to MSI GPUs
        System.out.println("Assembling MSI GPU");
    }
}
