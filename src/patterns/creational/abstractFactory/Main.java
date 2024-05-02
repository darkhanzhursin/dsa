package patterns.creational.abstractFactory;

import patterns.creational.abstractFactory.factories.AsusManufacturer;
import patterns.creational.abstractFactory.factories.Company;
import patterns.creational.abstractFactory.factories.MsiManufacturer;
import patterns.creational.abstractFactory.products.Product;

import java.util.List;
/*
* Abstract Factory is a creational design pattern that lets you produce families of related objects without
specifying their concrete classes.
*
*
* Abstract Products declare interfaces for a set of distinct but related products which make up a product family.
Concrete Products are various implementations of abstract products, grouped by variants. Each abstract product must
be implemented in all given variants.
* Abstract Factory interface declares a set of methods for creating each of the abstract products.
* Concrete Factories implement creation methods of the abstract factory. Each concrete factory corresponds to a
specific variant of products and creates only those product variants.
* Although concrete factories instantiate concrete products, signatures of their creation methods must return
corresponding abstract products. This way the client code that uses a factory doesn’t get coupled to the specific
variant of the product it gets from a factory. The Client can work with any concrete factory/product variant, as
long as it communicates with their objects via abstract interfaces.
* */
public class Main {

    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        Company asus = new AsusManufacturer();

        List.of(msi.createGpu(), msi.createMonitor(), asus.createGpu(), asus.createMonitor())
                .forEach(Product::assemble);
    }
}
