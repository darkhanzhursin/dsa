package patterns.creational.abstractFactory.factories;

import patterns.creational.abstractFactory.products.Gpu;
import patterns.creational.abstractFactory.products.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
