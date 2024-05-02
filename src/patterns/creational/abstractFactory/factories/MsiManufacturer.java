package patterns.creational.abstractFactory.factories;

import patterns.creational.abstractFactory.products.Gpu;
import patterns.creational.abstractFactory.products.Monitor;
import patterns.creational.abstractFactory.products.MsiGpu;
import patterns.creational.abstractFactory.products.MsiMonitor;

public class MsiManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
