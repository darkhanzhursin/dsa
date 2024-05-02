package patterns.creational.abstractFactory.factories;

import patterns.creational.abstractFactory.products.AsusGpu;
import patterns.creational.abstractFactory.products.AsusMonitor;
import patterns.creational.abstractFactory.products.Gpu;
import patterns.creational.abstractFactory.products.Monitor;

public class AsusManufacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
